package com.fsr.ems.dto;

import java.math.BigDecimal;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
public class Company  {

    /**
     * 名前
     */
    private String name;
    /**
     * 郵便番号
     */
    private String post_code;
    /**
     * 地址1
     */
    private String address_1;
    /**
     * 地址2
     */
    private String address_2;
    /**
     * 電話番号
     */
    private String tel;
    /**
     * ファックス
     */
    private String fax;

}
