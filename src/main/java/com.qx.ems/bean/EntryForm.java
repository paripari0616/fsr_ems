package com.qx.ems.bean;

import java.util.List;

import com.qx.ems.dto.User;

import lombok.Data;

@Data
public class EntryForm {

	private String username;
	
	private String password;
	
	private List<User> users;
	
	private Integer size;
}
