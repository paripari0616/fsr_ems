package com.fsr.ems.Dao;

import java.util.List;

import com.fsr.ems.dto.SelectOption;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommonDao {
	List<SelectOption> getMasterInfo(String masterCode);
}
