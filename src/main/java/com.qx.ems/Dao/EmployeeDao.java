package com.qx.ems.Dao;

import com.qx.ems.dto.Employee;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface EmployeeDao {
	int getUser(String username, String password);

	void delete(Long id);
	
	Employee search(Long id);
}
