package com.fsr.ems.Dao;

import com.fsr.ems.dto.Company;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface QuotationDao {
    List<Company> init();

    Company getCompany(String name);
}
