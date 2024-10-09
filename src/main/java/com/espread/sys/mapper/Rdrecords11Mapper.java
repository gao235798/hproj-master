package com.espread.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.espread.sys.model.Rdrecords11;

import tk.mybatis.mapper.common.Mapper;

public interface Rdrecords11Mapper extends Mapper<Rdrecords11> {
	
	List selectByRdrecords11(@Param("id") Long id);
}