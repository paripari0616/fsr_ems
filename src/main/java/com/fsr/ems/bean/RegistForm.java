package com.fsr.ems.bean;

import java.util.List;

import com.fsr.ems.dto.SelectOption;

import lombok.Data;

@Data
public class RegistForm {
	/** ユーザネーム */
	private String username;
	/** 姓名 */
	private String realname;
	/** パスワード */
	private String password;
	/** 性別 */
	private String gender;
	/** 認証コード */
	private String code;
	/** 認証コード（確認用） */
	private String confirmCode;
	/** 性別オプション */
	private List<SelectOption> genderOptions;
}
