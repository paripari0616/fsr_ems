package com.fsr.ems.service;

import com.fsr.ems.dto.Company;
import com.fsr.ems.dto.QuotationInfo;
import org.springframework.stereotype.Service;

@Service
public interface QuotationService {
    QuotationInfo init();

    Company getCompany(String name);
}
