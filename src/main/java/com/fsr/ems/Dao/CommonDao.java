package com.fsr.ems.Dao;

import java.util.List;

import com.fsr.ems.dto.Adjustment;
import com.fsr.ems.dto.Party_B;
import com.fsr.ems.dto.SelectOption;
import com.fsr.ems.dto.Whole;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommonDao {
	List<SelectOption> getMasterInfo(String masterCode);

	List<Party_B> getParty_b(String masterCode);

   	List<Adjustment> getAdjustment(String masterCode);

	List<Whole> getWhole(String masterCode);
}
