package com.espread.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.espread.sys.model.Rdrecord10;
import com.espread.sys.model.TransVouch;

import tk.mybatis.mapper.common.Mapper;

public interface Rdrecord10Mapper extends Mapper<Rdrecord10> {
	List selectByALLRdrecord10();
	
	
	int updateRdrecord10(@Param("id") Long id,@Param("cDefine8") String cDefine8);
	
	List selectByALLSCRK();
}