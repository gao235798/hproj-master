package com.espread.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.espread.sys.model.MomMoallocate;
import com.espread.sys.model.MomOrderdetail;

import tk.mybatis.mapper.common.Mapper;

public interface MomMoallocateMapper  extends Mapper<MomMoallocate> {
	List selectByALLMomMoallocate(@Param("modid") Integer modid);
}