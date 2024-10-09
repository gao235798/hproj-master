package com.espread.sys.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import tk.mybatis.mapper.common.Mapper;

import com.espread.common.annotation.DataSourceChange;
import com.espread.common.constant.Const;
import com.espread.common.web.PageInfo;
import com.espread.sys.model.SysUser;
import com.espread.sys.model.result.SysUserVo;

public interface SysUserMapper extends Mapper<SysUser> {

    /**
     * 用户列表   findUserPageCondition 就是对应的map id
     *
     * @param pageInfo
     * @param pageInfo
     * @return
     */
    List<SysUserVo> findUserPageCondition(@Param("pageInfo") PageInfo pageInfo, @Param("condition") Map<String, Object> condition);

    /**
     * 通过登录用户名查询用户
     *
     * @param loginname
     * @return
     */
    @DataSourceChange(Const.DATASOURCE_MASTER)
    SysUser findUserByLoginName(String loginname);

    /**
     * 通过用户Id查找用户信息
     *
     * @param userId
     * @return
     */
    SysUserVo findUserVoById(String userId);

}