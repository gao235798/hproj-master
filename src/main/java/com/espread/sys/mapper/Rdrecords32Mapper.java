package com.espread.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.espread.sys.model.Rdrecord32;
import com.espread.sys.model.Rdrecords32;

import tk.mybatis.mapper.common.Mapper;

public interface Rdrecords32Mapper extends Mapper<Rdrecords32> {
    List selectByRdrecords32(@Param("id") Long id);
}