package com.fsr.ems.service.Impl;

import com.fsr.ems.Dao.QuotationDao;
import com.fsr.ems.dto.Company;
import com.fsr.ems.dto.QuotationInfo;
import com.fsr.ems.service.QuotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuotationServicelmpl implements QuotationService {

    @Autowired
    private QuotationDao quotationDao;

    public QuotationInfo init() {
        //会社情報取得
        QuotationInfo quotationInfo = new QuotationInfo();
        quotationInfo.setCompanies(quotationDao.init());
        return quotationInfo;
    }

    public Company getCompany(String name) {
        return quotationDao.getCompany(name);
    }
}
