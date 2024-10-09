package com.espread.sys.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.espread.sys.model.Rdrecord32;

import tk.mybatis.mapper.common.Mapper;

public interface Rdrecord32Mapper  extends Mapper<Rdrecord32>{
	List selectByALLRdrecord32();
	
	
	int updateRdrecord32(@Param("id") Long id,@Param("cDefine8") String cDefine8);
}