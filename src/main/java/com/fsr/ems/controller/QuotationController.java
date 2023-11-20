package com.fsr.ems.controller;

import com.fsr.ems.bean.EntryForm;
import com.fsr.ems.service.EstimateCreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fsr.ems.define.ScreenIdDefine;

@Controller
@RequestMapping("/quotation")
public class QuotationController {
	@Autowired
	private EstimateCreateService estimateCreateService;

	@GetMapping("/init")
	public String init() {
		return ScreenIdDefine.QUOTATION;
	}

}
