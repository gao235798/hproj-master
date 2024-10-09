package com.espread.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.espread.sys.model.SaleBillVouch;
import com.espread.sys.model.SaleBillVouchs;

import tk.mybatis.mapper.common.Mapper;

public interface SaleBillVouchsMapper  extends Mapper<SaleBillVouchs>{
	List selectByKPVIN(@Param("SBVID") Integer SBVID );
}