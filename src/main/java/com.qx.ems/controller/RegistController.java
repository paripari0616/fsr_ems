package com.qx.ems.controller;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import com.qx.ems.bean.RegistForm;
import com.qx.ems.define.MasterDefine;
import com.qx.ems.define.ScreenIdDefine;
import com.qx.ems.dto.SelectOption;
import com.qx.ems.service.CommonService;
import com.qx.ems.service.RegistService;
import com.qx.ems.utils.ValidateImageCodeUtils;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/regist")
public class RegistController {
	
	@Autowired
	RegistService registService;
	
	@Autowired
	CommonService commonService;
	
	// 初始化注解
	// 类似于静态代码块
	// 在你调用实际方法之前执行
	@ModelAttribute
	RegistForm initialization() {
		List<SelectOption> genderOptions = commonService.getMasterInfo(MasterDefine.GENDER);
		RegistForm form = new RegistForm();
		form.setGender("0");
		form.setGenderOptions(genderOptions);
		return form;
	}

	@PostMapping("/init")
	public String init(RegistForm form) {
		return ScreenIdDefine.REGIST;
	}

	@PostMapping("/confirm")
	public String login(RegistForm form, HttpSession session) {
		
		if(StringUtils.equals(session.getAttribute("code"), form.getConfirmCode())) {
			registService.insertUser(form);
			return ScreenIdDefine.RENTRY;
		} else {
			return ScreenIdDefine.REGIST;
		}
	}
	
	@GetMapping("/code")
	@ResponseBody
	public Map<String, String> getImage(HttpSession session) throws IOException {
		String securityCode = (String)session.getAttribute("code");
		if(StringUtils.isEmpty(securityCode)) {
			securityCode = ValidateImageCodeUtils.getSecurityCode();
			session.setAttribute("code", securityCode);
		} 

	    BufferedImage image = ValidateImageCodeUtils.createImage(securityCode);
	    ByteArrayOutputStream bos = new ByteArrayOutputStream();
	    ImageIO.write(image, "png", bos);

	    byte[] imageBytes = bos.toByteArray();
	    String base64Image = Base64.getEncoder().encodeToString(imageBytes);

	    Map<String, String> responseMap = new HashMap<>();
	    responseMap.put("image", base64Image);
	    return responseMap;
	}
	
	@GetMapping("/distribute")
	@ResponseBody
	public Map<String, String> getNewImage(HttpSession session) throws IOException {
		String securityCode = ValidateImageCodeUtils.getSecurityCode();
		session.setAttribute("code", securityCode);
	    BufferedImage image = ValidateImageCodeUtils.createImage(securityCode);
	    ByteArrayOutputStream bos = new ByteArrayOutputStream();
	    ImageIO.write(image, "png", bos);

	    byte[] imageBytes = bos.toByteArray();
	    String base64Image = Base64.getEncoder().encodeToString(imageBytes);

	    Map<String, String> responseMap = new HashMap<>();
	    responseMap.put("image", base64Image);
	    return responseMap;
	}
}
