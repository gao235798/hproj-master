package com.espread.sys.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.espread.common.web.service.BaseService;
import com.espread.sys.model.Inventory;

/**
 * 存货
 *
 * @author ww 2018-12-25
 */
public interface LesToErpService extends BaseService<Inventory> {

    /**
     * 查询待处理数据
     * @return
     */
	  void  getUserById(Map<String, Object> parm ); 

}
