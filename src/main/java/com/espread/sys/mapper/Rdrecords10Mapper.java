package com.espread.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.espread.sys.model.Rdrecords10;
import com.espread.sys.model.TransVouchs;

import tk.mybatis.mapper.common.Mapper;

public interface Rdrecords10Mapper extends Mapper<Rdrecords10> {

    List selectByRdrecords10(@Param("id") Long id);

    List selectBySCRKVIN(@Param("id") Long id);

}