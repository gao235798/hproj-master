package com.espread.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.espread.sys.model.DMSInventory;
import com.espread.sys.model.Inventory;

import tk.mybatis.mapper.common.Mapper;

public interface DMSInventoryMapper extends Mapper<DMSInventory>{
	List selectByCH();
	List selectByPJ();
	List selectByPJQT();
	List selectByPJCX();
	int updateInventory(@Param("i_id") Integer i_id,@Param("tstatus") String tstatus);
	List selectByPJGYS(@Param("cinvcode") String cinvcode);
	List selectByPJXCS(@Param("ComponentId") Integer ComponentId);
	
	int updatePU_PriceJustDetail(@Param("autoid") Integer autoid,@Param("cdefine22") String cdefine22);
	int updatebom_opcomponent(@Param("ComponentId") Integer ComponentId,@Param("Define33") String Define33);
	
}