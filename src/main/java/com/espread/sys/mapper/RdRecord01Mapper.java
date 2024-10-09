package com.espread.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.espread.sys.model.RdRecord01;
import com.espread.sys.model.Rdrecord10;

import tk.mybatis.mapper.common.Mapper;

public interface RdRecord01Mapper  extends Mapper<RdRecord01>{

	int updateRdrecord01(@Param("id") Long id,@Param("cDefine8") String cDefine8);
	
	List selectByALLSCRKCG();
}