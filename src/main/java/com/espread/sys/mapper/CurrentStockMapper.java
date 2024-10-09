package com.espread.sys.mapper;
import java.math.BigDecimal;
import org.apache.ibatis.annotations.Param;

import com.espread.sys.model.CurrentStock;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface CurrentStockMapper extends Mapper<CurrentStock> {
	List selectByALL();

	CurrentStock selectOneByCinvcodeAndCwhcode(@Param("cinvcode") String cinvcode, @Param("cwhcode") String cwhcode);

	int updateIquantityByAutoid(@Param("iquantity") BigDecimal iquantity, @Param("autoid") Integer autoid);
}