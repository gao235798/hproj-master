package com.espread.sys.mapper;
import java.math.BigDecimal;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.espread.sys.model.SOSODetails;
import com.espread.sys.model.SOSOMain;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.base.update.UpdateByPrimaryKeyMapper;

public interface SOSODetailsMapper extends Mapper<SOSODetails> {
	List selectByALLSOSODetails(@Param("id") Integer id);

	SOSODetails selectByAutoid(@Param("autoid") Integer autoid);

	SOSODetails selectByCsocodeAndCinvcode(@Param("csocode") String csocode, @Param("cinvcode") String cinvcode);

	int updateFretquantityByAutoid(@Param("fretquantity") BigDecimal fretquantity, @Param("autoid") Integer autoid);

	int updateFretquantityAndIfhquantityByAutoid(@Param("fretquantity") BigDecimal fretquantity, @Param("ifhquantity") BigDecimal ifhquantity, @Param("autoid") Integer autoid);
//	@Override
//	int updateByPrimaryKey(@Param("sosoDetails") SOSODetails sosoDetails);



}