package com.fsr.ems.dto;

import com.fsr.ems.dto.common.Common;
import com.fsr.ems.dto.common.Common2;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class Party_B extends Common2 {
    // 社名
    private String company_id;
    // 住所
    private String address;
    // TEL
    private Integer tel;
    // FAX
    private Integer fax;
}
