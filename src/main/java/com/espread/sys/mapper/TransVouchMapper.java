package com.espread.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;


import com.espread.sys.model.TransVouch;

import tk.mybatis.mapper.common.Mapper;

public interface TransVouchMapper  extends Mapper<TransVouch> {
	List selectByALLDb();
	List selectByALLWltk();
	List selectByALLBf();
	
	List selectByALLSH();
	
	int updateTransVouch(@Param("id") Integer id,@Param("cDefine8") String cDefine8);
}