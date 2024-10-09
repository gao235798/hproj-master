package com.espread.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.espread.sys.model.Inventory;


import tk.mybatis.mapper.common.Mapper;

public interface InventoryMapper extends Mapper<Inventory> {
	List selectByALL();

	Inventory selectByCinvcode(@Param("cinvcode") String cinvcode);
	int updateInventory(@Param("i_id") Integer i_id,@Param("tstatus") String tstatus);
}