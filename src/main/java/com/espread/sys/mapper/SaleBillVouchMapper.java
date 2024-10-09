package com.espread.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.espread.sys.model.Rdrecord32;
import com.espread.sys.model.SaleBillVouch;

import tk.mybatis.mapper.common.Mapper;

public interface SaleBillVouchMapper  extends Mapper<SaleBillVouch>{
	List selectByALLSaleBillVouch();
	
	
	int updateSaleBillVouch(@Param("SBVID") Integer SBVID,@Param("cDefine8") String cDefine8);
}