package com.espread.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.espread.sys.model.Rdrecords01;
import com.espread.sys.model.Rdrecords10;

import tk.mybatis.mapper.common.Mapper;

public interface Rdrecords01Mapper extends Mapper<Rdrecords01> {
    List selectByRdrecords01(@Param("id") Long id);

    List selectBySCRKCGVIN(@Param("id") Long id);
}