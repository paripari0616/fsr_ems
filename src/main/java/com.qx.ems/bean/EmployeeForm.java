package com.qx.ems.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import com.qx.ems.dto.Employee;
import lombok.Data;

@Data
public class EmployeeForm {
	List<Employee> employees = new ArrayList<>();
	
	private Integer id;
	
	private String name;
	
	private BigDecimal salary;
	
	private Integer age;
	
	private Date birthday;
	
	private Integer row;
}
