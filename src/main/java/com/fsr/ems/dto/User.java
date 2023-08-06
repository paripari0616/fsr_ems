package com.fsr.ems.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class User extends Person {
    /**
     * 名前
     */
    private String name;
    /**
     * 暗証番号
     */
    private String password;
}
