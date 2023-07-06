package com.qx.ems.Dao;

import org.apache.ibatis.annotations.Mapper;

import com.qx.ems.dto.User;

@Mapper
public interface RegistDao {
	void insertUser(User user);
}
