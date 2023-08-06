package com.fsr.ems.dto;

import java.math.BigDecimal;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class Employee  extends Person  {

	/**
     * 名前
     */
    private String name;
    /**
     * 暗証番号
     */
    private String password;
    /**
     * 給料
     */
	private BigDecimal salary;
}
