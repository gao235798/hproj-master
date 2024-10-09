package com.espread.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.espread.sys.model.Rdrecord11;

import tk.mybatis.mapper.common.Mapper;

public interface Rdrecord11Mapper extends Mapper<Rdrecord11> {
	List selectByALLRdrecord11();
	
	
	int updateRdrecord11(@Param("id") Long id,@Param("cDefine8") String cDefine8);
}