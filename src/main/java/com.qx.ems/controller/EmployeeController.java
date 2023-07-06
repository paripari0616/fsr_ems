package com.qx.ems.controller;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.qx.ems.bean.EmployeeForm;
import com.qx.ems.bean.EntryForm;
import com.qx.ems.define.ScreenIdDefine;
import com.qx.ems.dto.Employee;
import com.qx.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	EmployeeService empService;
	
	@ModelAttribute
	EmployeeForm initialization(Model model) throws Exception {
		EmployeeForm form = new EmployeeForm();
		return form;
	}
	
	@PostMapping("/init")
	public String init(EmployeeForm eeform, EntryForm etform) throws Exception{
		// 根据权限能否看到一栏
		// 管理员所有用户一栏
		// 一般用户只有自己的信息
		
		int cnt = empService.getUser(etform);
		if(cnt >= 1) {
			Employee e = new Employee();
			e.setId(1L);
			e.setName("test1");
			e.setBirthday(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));
			e.setAge(0);
			e.setSalary(BigDecimal.ZERO);
			eeform.getEmployees().add(e);
			return ScreenIdDefine.EMPLOYEE;
		} else {
			return ScreenIdDefine.ENTRY;
		}
	}
	
	@PostMapping("/delete")
	public String delete(EmployeeForm eeform) {
		Long id = eeform.getEmployees().get(eeform.getRow()).getId();
		empService.delete(id);
		return ScreenIdDefine.EMPLOYEE;
	}
	
	@PostMapping("/modify")
	public String modify(EmployeeForm eeform) {
		Long id = eeform.getEmployees().get(eeform.getRow()).getId();
		Employee emp = empService.modify(id);
		setEmployeeForm(eeform, emp);
		return ScreenIdDefine.MODIFY;
	}
	
	private void setEmployeeForm(EmployeeForm form, Employee emp) {
		
	}
}
