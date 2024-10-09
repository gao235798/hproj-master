package com.espread.sys.mapper;

import com.espread.sys.model.IaSummary;

/**
* @author Administrator
* @description 针对表【IA_Summary】的数据库操作Mapper
* @createDate 2024-04-25 15:11:20
* @Entity com.espread.sys.model.IaSummary
*/
public interface IaSummaryMapper {

    int deleteByPrimaryKey(Long id);

    int insert(IaSummary record);

    int insertSelective(IaSummary record);

    IaSummary selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IaSummary record);

    int updateByPrimaryKey(IaSummary record);


}
