package com.fsr.ems.service;

import java.util.List;

import com.fsr.ems.Dao.CommonDao;
import com.fsr.ems.dto.SelectOption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonService {

	@Autowired
    CommonDao commonDao;
	
	public List<SelectOption> getMasterInfo(String masterCode) {
		return commonDao.getMasterInfo(masterCode);
	}
}
