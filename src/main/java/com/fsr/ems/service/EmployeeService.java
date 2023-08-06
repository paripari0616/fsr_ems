package com.fsr.ems.service;

import com.fsr.ems.Dao.EmployeeDao;
import com.fsr.ems.bean.EntryForm;
import com.fsr.ems.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	public int getUser(EntryForm form) {
		return employeeDao.getUser(form.getUsername(), form.getPassword());
	}
	
	public void delete(Long id) {
		employeeDao.delete(id);
	}
	
	public Employee modify(Long id) {
		return employeeDao.search(id);
	}
}
