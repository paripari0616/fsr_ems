package com.fsr.ems.dto;

import com.fsr.ems.dto.common.Common;
import com.fsr.ems.dto.common.Common2;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper=false)
public class Adjustment extends Common2 {
    // 氏名
    private String NAME;
    // 月数
    private Number MONTH_COUNT;
    // 基本金額
    private Number UNIT_PRICE;
    // 超過単価
    private Number EXCESS_PRICE;
    // 控除単価
    private Number DEDUCTIBLE_PRICE;
    // 基準時間(Ｈ)_下限
    private Number TIME_LOWER_LIMIT;
    // 基準時間(Ｈ)_上限
    private Number TIME_UPPER_LIMIT;
    // 作業期間(開始)
    private Date DATE_START;
    // 作業期間(終了)
    private Date DATE_END;
    // 備考
    private String REMARK;
    // 合計
    private Number SUM;
}
