package com.fsr.ems.controller;

import com.fsr.ems.define.ScreenIdDefine;
import com.fsr.ems.dto.Company;
import com.fsr.ems.service.QuotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/quotation")
public class QuotationController {
	@Autowired
	private QuotationService quotationService;

	@GetMapping("/init")
	public String getCompany() {
		return ScreenIdDefine.QUOTATION;
	}

	@GetMapping("/getCompany")
	@ResponseBody
	public Company getCompany(@RequestParam(required = true,name = "name") String name) {
		return quotationService.getCompany(name);
	}
}
