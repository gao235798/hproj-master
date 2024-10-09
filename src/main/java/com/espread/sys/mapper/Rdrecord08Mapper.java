package com.espread.sys.mapper;

import com.espread.sys.model.Rdrecord08;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author Administrator
* @description 针对表【RdRecord08】的数据库操作Mapper
* @createDate 2024-04-15 09:13:04
* @Entity com.espread.sys.model.Rdrecord08
*/
public interface Rdrecord08Mapper {

    int deleteByPrimaryKey(Long id);

    int insert(Rdrecord08 record);

    int insertSelective(Rdrecord08 record);

    Rdrecord08 selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Rdrecord08 record);

    int updateByPrimaryKey(Rdrecord08 record);


    int updateRdrecord08(@Param("id") Long var1, @Param("cDefine8") String var2);

    List selectByALLSCRKQT();

}
