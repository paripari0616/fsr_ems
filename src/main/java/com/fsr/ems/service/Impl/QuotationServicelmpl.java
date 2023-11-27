package com.fsr.ems.service.Impl;

import com.fsr.ems.Dao.QuotationDao;
import com.fsr.ems.dto.Company;
import com.fsr.ems.service.QuotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class QuotationServicelmpl implements QuotationService {

    @Autowired
    private QuotationDao quotationDao;

    public Company getCompany(String name) {
        return quotationDao.getCompany(name);
    }
}
