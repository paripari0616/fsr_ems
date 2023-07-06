package com.qx.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qx.ems.Dao.CommonDao;
import com.qx.ems.dto.SelectOption;

@Service
public class CommonService {

	@Autowired
	CommonDao commonDao;
	
	public List<SelectOption> getMasterInfo(String masterCode) {
		return commonDao.getMasterInfo(masterCode);
	}
}
