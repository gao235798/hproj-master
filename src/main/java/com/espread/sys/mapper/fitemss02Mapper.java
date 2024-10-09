package com.espread.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.espread.sys.model.fitemss02;

import tk.mybatis.mapper.common.Mapper;

public interface fitemss02Mapper  extends Mapper<fitemss02>{
	List selectByALL();
	int updateFitemss02(@Param("i_id") Integer i_id,@Param("tstatus") String tstatus);
}