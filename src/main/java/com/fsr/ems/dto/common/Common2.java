package com.fsr.ems.dto.common;

import java.sql.Timestamp;
import java.util.Date;

import lombok.Data;

@Data
public class Common2 {
    // リビジョン番号
    private Number REV_NO;

    // 作成日時
    private Timestamp CRT_DATE;

    // 作成者ID
    private String CRTPRSN_ID;

    // 更新日時
    private Timestamp UPD_DATE;

    // 更新者ID
    private String UPDPRSN_ID;

    // 削除フラグ
    private String DEL_FLG;

    // 削除日時
    private Timestamp DEL_DATE;

    // 削除者ID
    private String DELPRSN_ID;
}
