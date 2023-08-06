package com.fsr.ems.controller;

import com.fsr.ems.bean.EntryForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fsr.ems.define.ScreenIdDefine;

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
