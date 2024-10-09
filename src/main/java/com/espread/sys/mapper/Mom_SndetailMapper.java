package com.espread.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.espread.sys.model.MomMoallocate;
import com.espread.sys.model.Mom_Sndetail;

import tk.mybatis.mapper.common.Mapper;

public interface Mom_SndetailMapper  extends Mapper<Mom_Sndetail> {
	List selectByALLMomSndetail(@Param("iVouchsID") Integer iVouchsID);
}