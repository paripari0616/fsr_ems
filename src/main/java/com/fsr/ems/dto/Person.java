package com.fsr.ems.dto;

import com.fsr.ems.dto.common.Common;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class Person extends Common {
    /**
     * ID
     */
    private Long id;
    /**
     * 本名
     */
    private String realname;
    /**
     * 性別
     */
    private String gender;
    /**
     * 年齢
     */
    private Integer age;
    /**
     * 誕生日
     */
    private String birthday;
    /**
     * 住所
     */
    private String address;
    /**
     * 電話番号
     */
    private String phoneNumber;
}
