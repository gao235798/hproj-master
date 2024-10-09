package com.espread.sys.mapper;

import com.espread.sys.model.SysDict;
import com.espread.sys.model.result.SysDictVo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface SysDictMapper extends Mapper<SysDict> {

    //查找全部
    List<SysDictVo> findDicAlltVo(@Param("dictType") String dictType);

    //通过条件查询
    List<SysDict> findByCondition(@Param("condition") Map<String, Object> condition);
}