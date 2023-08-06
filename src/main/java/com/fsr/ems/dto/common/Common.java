package com.fsr.ems.dto.common;

import java.util.Date;

import lombok.Data;

@Data
public class Common {
	
    /**
     * 更新日時
     */
    private Date updateDate;
    /**
     * 更新者
     */
    private String updateMember;
    /**
     * 登録日時
     */
    private Date createDate;
    /**
     * 登録者
     */
    private String createMember;
}
