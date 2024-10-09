package com.espread.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.espread.sys.model.Warehouse;

import tk.mybatis.mapper.common.Mapper;

public interface WarehouseMapper extends Mapper<Warehouse> { 
	List selectByALL();
	int updateWarehouse(@Param("i_id") Integer i_id,@Param("tstatus") String tstatus);
}