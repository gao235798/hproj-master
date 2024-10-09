package com.espread.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.espread.sys.model.MomOrderdetail;
import com.espread.sys.model.TransVouch;

import tk.mybatis.mapper.common.Mapper;

public interface MomOrderdetailMapper extends Mapper<MomOrderdetail> {
	List selectByMomOrderdetail();
	
	int updateMomOrderdetail(@Param("modid") Integer modid ,@Param("Define24") String Define24);
	
	
	List selectByMomOrderdetailJHFK();
	
	List selectByMomOrderdetailJHFKMX(@Param("SoCode") String SoCode,@Param("cinvcode") String cinvcode);
	
	int updateMomOrderdetailJHFK(@Param("modid") Integer modid ,@Param("Define25") String Define25);
}