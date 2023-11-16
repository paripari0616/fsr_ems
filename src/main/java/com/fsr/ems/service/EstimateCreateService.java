package com.fsr.ems.service;

import com.fsr.ems.Dao.RegistDao;
import com.fsr.ems.bean.RegistForm;
import com.fsr.ems.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface EstimateCreateService {

    /**
     *　画面初期化
     */
    String init();
}
