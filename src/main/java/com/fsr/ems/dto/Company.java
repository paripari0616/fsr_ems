package com.fsr.ems.dto;

import lombok.Data;

//会社情報
@Data
public class Company {
    //社名
    private String name;
    //郵便番号
    private String postCode;
    //住所1
    private String address1;
    //住所2
    private String address2;
    //電話番号
    private String tel;
    //ファックス
    private String fax;
}
