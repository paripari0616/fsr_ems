package com.fsr.ems.Dao;

import com.fsr.ems.dto.Company;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface QuotationDao {
    Company getCompany(String name);
}
