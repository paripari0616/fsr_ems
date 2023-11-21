package com.fsr.ems.service.Impl;

import com.fsr.ems.Dao.CompaniesDao;
import com.fsr.ems.dto.Companies;
import com.fsr.ems.service.CompaniesService;
import org.springframework.beans.factory.annotation.Autowired;

public class CompaniesServicelmpl implements CompaniesService {
    @Autowired
    private CompaniesDao companiesDao;
    public Companies getCompanies(Companies companies) {
        return companiesDao.getCompanies(companies);
    }
}
