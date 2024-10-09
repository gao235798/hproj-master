package com.espread.sys.mapper;
import org.apache.ibatis.annotations.Param;

import com.espread.sys.model.Dispatchlists;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
* @author Administrator
* @description 针对表【DispatchLists】的数据库操作Mapper
* @createDate 2024-03-26 11:44:40
* @Entity com.espread.sys.model.Dispatchlists
*/
public interface DispatchlistsMapper  extends Mapper<Dispatchlists> {

    int insert(Dispatchlists record);

    int insertSelective(Dispatchlists record);

    List<Dispatchlists> selectByDlid(@Param("dlid") Integer dlid);

    int updateByPrimaryKeySelective(Dispatchlists record);

    int updateByPrimaryKey(Dispatchlists record);

    Dispatchlists selectByDlidAndCinvcode(@Param("dlid") Integer dlid, @Param("cinvcode") String cinvcode);

}
