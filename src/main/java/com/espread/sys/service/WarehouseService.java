package com.espread.sys.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.espread.common.web.service.BaseService;
import com.espread.sys.model.Inventory;
import com.espread.sys.model.Warehouse;

/**
 * 仓库
 *
 * @author ww 2018-12-25
 */
public interface WarehouseService extends BaseService<Warehouse> {

    /**
     * 查询待处理数据
     * @return
     */
    List selectByALL();
    

}
