package com.espread.sys.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.espread.sys.model.StSnstate;

/**
* @author Administrator
* @description 针对表【ST_SNState】的数据库操作Mapper
* @createDate 2024-04-25 16:33:55
* @Entity com.espread.sys.model.StSnstate
*/
public interface StSnstateMapper {

    int deleteByPrimaryKey(Long id);

    int insert(StSnstate record);

    int insertSelective(StSnstate record);

    StSnstate selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(StSnstate record);

    int updateByPrimaryKey(StSnstate record);

    int updateIsnoperatecountByAutoid(@Param("isnoperatecount")Integer isnoperatecount,@Param("autoid")Integer autoid);

    StSnstate selectByCinvsn(@Param("cinvsn") String cinvsn);

    StSnstate selectOneByCinvsn(@Param("cinvsn") String cinvsn);

}
