package com.fsr.ems.controller;

import com.fsr.ems.bean.EntryForm;
import com.fsr.ems.dto.Companies;
import com.fsr.ems.dto.Party_B;
import com.fsr.ems.service.CompaniesService;
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
	@Autowired
	private CompaniesService companiesService;
	@GetMapping("/init")
	public String init(Companies companies) {
		Companies Company = companiesService.getCompanies(companies);

		return ScreenIdDefine.QUOTATION;
	}

}
