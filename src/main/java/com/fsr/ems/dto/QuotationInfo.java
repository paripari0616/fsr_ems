package com.fsr.ems.dto;

import lombok.Data;

import java.util.List;

//見積情報
@Data
public class QuotationInfo {
    //会社情報
    private List<Company> Companies;
}
