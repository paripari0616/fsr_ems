package com.fsr.ems.dto;

import com.fsr.ems.dto.common.Common;
import com.fsr.ems.dto.common.Common2;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper=false)
public class Whole extends Common2 {
    // 見積番号
    private Number ESTIMATE_NUM;
    // 会社名
    private String COMPANY_ID;
    // 日期
    private Date DATE;
    // 御見積金額
    private Number ESTIMATE_AMOUNT;
    // 期間
    private String CENTRE_DATE;
    // 納期
    private String DELIVERY;
    // 検収日
    private String RECEIPT_DATE;
    // 支払方法
    private String PAY_METHOD;
    // 見積有効期間
    private Date ESTIMATE_DATE;
    // 件名/仕様No.
    private String NAME_ID;
    // 作業内容
    private String WORK_CONTENTS;
    // 作業責任者（部署）
    private String RESPONSIBLE_PERSON;
    // 作業責任者（氏名）
    private String PERSON_ID;
    // 精算単位
    private String UNIT;
    // 備　考
    private String REMARKS;
}