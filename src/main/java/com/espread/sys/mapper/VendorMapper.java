package com.espread.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.espread.sys.model.Vendor;

import tk.mybatis.mapper.common.Mapper;

public interface VendorMapper extends Mapper<Vendor>{
	List selectByALL();
	int updateVendor(@Param("i_id") Integer i_id,@Param("tstatus") String tstatus);
}