package com.qx.ems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qx.ems.Dao.RegistDao;
import com.qx.ems.bean.RegistForm;
import com.qx.ems.dto.User;

@Service
public class RegistService {

	@Autowired
	RegistDao registDao;
	
	public void insertUser(RegistForm form) {
		
		User user = new User() {{
			setName(form.getUsername());
			setRealname(form.getRealname());
			setPassword(form.getPassword());
			setGender(form.getGender());
		}};
		registDao.insertUser(user);
	}
}
