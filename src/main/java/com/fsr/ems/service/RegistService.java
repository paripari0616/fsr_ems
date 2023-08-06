package com.fsr.ems.service;

import com.fsr.ems.Dao.RegistDao;
import com.fsr.ems.bean.RegistForm;
import com.fsr.ems.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
