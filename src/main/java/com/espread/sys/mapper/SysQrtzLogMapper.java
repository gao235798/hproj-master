package com.espread.sys.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.espread.common.web.PageInfo;

import com.espread.sys.model.SysQrtzLog;

import tk.mybatis.mapper.common.Mapper;

public interface SysQrtzLogMapper extends Mapper<SysQrtzLog> {

    /**
     * 查询日志
     * @param pageInfo
     * @param condition
     * @return
     */
    List findLogPageCondition(@Param("pageInfo")PageInfo pageInfo, @Param("condition")Map<String, Object> condition);

    /**
     * 查询日志
     * @param pageInfo
     * @param condition
     * @return
     */
    List findall();

}