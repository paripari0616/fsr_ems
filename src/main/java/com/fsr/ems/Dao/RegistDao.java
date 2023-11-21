package com.fsr.ems.Dao;

import com.fsr.ems.dto.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RegistDao {
	void insertUser(User user);
}



