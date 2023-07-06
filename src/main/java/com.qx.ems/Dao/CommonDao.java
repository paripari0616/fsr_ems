package com.qx.ems.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.qx.ems.dto.SelectOption;

@Mapper
public interface CommonDao {
	List<SelectOption> getMasterInfo(String masterCode);
}
