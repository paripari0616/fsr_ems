package com.qx.ems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qx.ems.bean.EntryForm;
import com.qx.ems.define.ScreenIdDefine;

@Controller
@RequestMapping("/entry")
public class EntryController {

	@ModelAttribute
	EntryForm initialization() {
		return new EntryForm();
	}

	@GetMapping("/init")
	public String init(EntryForm form) {
		return ScreenIdDefine.ENTRY;
	}
	
	@PostMapping("/init")
	public String initBack(EntryForm form) {
		return ScreenIdDefine.ENTRY;
	}

	@PostMapping("/regist")
	public String login(EntryForm form, Model model) {
		return ScreenIdDefine.REGIST;
	}
}
