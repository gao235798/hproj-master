package com.espread.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.espread.sys.model.PriceJustify;

import tk.mybatis.mapper.common.Mapper;

public interface PriceJustifyMapper   extends Mapper<PriceJustify>{	
	List selectByALL();

	
	int updatePriceJustify(@Param("ID") Integer ID,@Param("cdefine23") String cdefine23);
}