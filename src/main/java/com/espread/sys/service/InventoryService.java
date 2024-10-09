package com.espread.sys.service;

import java.math.BigDecimal;
import java.util.List;

import com.espread.common.web.service.BaseService;
import com.espread.sys.model.Inventory;

/**
 * 存货
 *
 * @author ww 2018-12-25
 */
public interface InventoryService extends BaseService<Inventory> {

    /**
     * 查询待处理数据
     *
     * @return
     */
    List selectByALL();

    int updateInventory(Integer i_id, String tstatus);

    List selectByALLWarehouse();

    List selectByALLDepartment();

    List selectByALLVendor();

    List selectByALLDb();

    List selectByALLTransVouchs(Integer id);

    int updateTransVouch(Integer id, String cDefine8);

    List selectByALLWltk();

    List selectByALLBf();

    List selectByALLSH();

    List selectByALLRdrecord10();

    List selectByALLPOPomain();

    List selectByALLPOPomainGb();

    List selectByALLPOPomainXs();

    List selectPOPomainByCustomers(String customer);


    List selectByALLMomOrderdetail();

    List selectByALLFitemss02();


    ////dms
    List selectByCH();

    List selectByPJ();

    List selectByPJQT();

    List selectByPJCX();

    List selectByJG();

    List selectByPJCK();

    List selectBySCRK();

    List selectBySCRKCG();

    List selectByALLSaleBillVouch();

    List selectByALLSOSOMain();

    List selectByALLFHSH();

    List selectByALLJHFK();

    List selectByPJGYS(String Cinvcode);

    List selectByPJGYS(Integer id);
    ////dms

    List selectSomainCurrent();

    List selectCheckOrder();

    List selectBySCRKQT();


    BigDecimal selectCurrent(String cinvcode, Integer autoid);

    List selectDispatchListByCustomers(String number);
}
