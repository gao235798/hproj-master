package com.espread.sys.mapper;

import com.espread.sys.model.Rdrecords08;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author Administrator
* @description 针对表【rdrecords08】的数据库操作Mapper
* @createDate 2024-04-15 10:18:49
* @Entity com.espread.sys.model.Rdrecords08
*/
public interface Rdrecords08Mapper {

    List  selectByRdrecords08(@Param("id") Long var1);

    List  selectBySCRKCGVINQT(@Param("id") Long var1);

}
