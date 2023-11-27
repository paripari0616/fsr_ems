package com.fsr.ems.service;

import com.fsr.ems.dto.Company;
import org.springframework.stereotype.Service;
@Service
public interface QuotationService {
    Company getCompany(String name);
}
