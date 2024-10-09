package com.espread.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.espread.sys.model.TransVouchs;

import tk.mybatis.mapper.common.Mapper;

public interface TransVouchsMapper   extends Mapper<TransVouchs> {
	List selectByTransVouchs(@Param("id") Integer id);
	
}