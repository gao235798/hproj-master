package com.espread.sys.mapper;

import com.espread.sys.model.Computationunit;

/**
* @author Administrator
* @description 针对表【ComputationUnit】的数据库操作Mapper
* @createDate 2024-07-03 15:41:07
* @Entity com.espread.sys.model.Computationunit
*/
public interface ComputationunitMapper {

    Computationunit selectByPrimaryKey(String id);

}
