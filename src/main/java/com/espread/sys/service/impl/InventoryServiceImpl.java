package com.espread.sys.service.impl;

import com.espread.common.annotation.DataSourceChange;
import com.espread.common.constant.Const;
import com.espread.common.web.service.BaseServiceImpl;
import com.espread.sys.mapper.*;
import com.espread.sys.model.Inventory;
import com.espread.sys.service.InventoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class InventoryServiceImpl extends BaseServiceImpl<Inventory> implements InventoryService {

    private static Logger LOGGER = LoggerFactory.getLogger(InventoryServiceImpl.class);

    @Autowired
    private InventoryMapper inventoryMapper;

    @Autowired
    private WarehouseMapper warehouseMapper;

    @Autowired
    private fitemss02Mapper fitemss02Mapper;

    @Autowired
    private DepartmentMapper departmentMapper;

    @Autowired
    private VendorMapper vendorMapper;

    @Autowired
    private TransVouchMapper transVouchMapper;

    @Autowired
    private TransVouchsMapper transVouchsMapper;

    @Autowired
    private Rdrecord10Mapper rdrecord10Mapper;

    @Autowired
    private RdRecord01Mapper rdrecord01Mapper;

    @Autowired
    private POPomainMapper pOPomainMapper;

    @Autowired
    private MomOrderdetailMapper momOrderdetailMapper;


    @Autowired
    private Rdrecord11Mapper rdrecord11Mapper;

    @Autowired
    private DMSInventoryMapper dMSInventoryMapper;


    @Autowired
    private PriceJustifyMapper priceJustifyMapper;


    @Autowired
    private Rdrecord32Mapper rdrecord32Mapper;


    @Autowired
    private SaleBillVouchMapper saleBillVouchMapper;

    @Autowired
    private SOSOMainMapper sOSOMainMapper;

    @Autowired
    private DispatchListMapper dispatchListMapper;

    @Autowired
    private Rdrecord08Mapper rdrecord08Mapper;

    //les-bigin

    //物料
    @Override
    @DataSourceChange(Const.DATASOURCE_SLAVE)
    public List selectByALL() {

        return inventoryMapper.selectByALL();
    }


    @Override
    public int updateInventory(Integer i_id, String tstatus) {
        return inventoryMapper.updateInventory(i_id, tstatus);
    }

    //仓库
    @Override
    @DataSourceChange(Const.DATASOURCE_SLAVE)
    public List selectByALLWarehouse() {
        return warehouseMapper.selectByALL();
    }

    //部门
    @Override
    @DataSourceChange(Const.DATASOURCE_SLAVE)
    public List selectByALLDepartment() {
        return departmentMapper.selectByALL();
    }

    //供应商
    @Override
    @DataSourceChange(Const.DATASOURCE_SLAVE)
    public List selectByALLVendor() {
        return vendorMapper.selectByALL();
    }

    //调拨领料单接口
    @Override
    @DataSourceChange(Const.DATASOURCE_SLAVE)
    public List selectByALLDb() {
        return transVouchMapper.selectByALLDb();
    }

    //调拨明细
    @Override
    @DataSourceChange(Const.DATASOURCE_SLAVE)
    public List selectByALLTransVouchs(Integer id) {
        return transVouchsMapper.selectByTransVouchs(id);
    }

    //更新已经上传调拨单
    @Override

    public int updateTransVouch(Integer id, String cDefine8) {
        return transVouchMapper.updateTransVouch(id, cDefine8);
    }


    //物料退库接口
    @Override
    @DataSourceChange(Const.DATASOURCE_SLAVE)
    public List selectByALLWltk() {
        return transVouchMapper.selectByALLWltk();
    }

    //物料报废接口
    @Override
    @DataSourceChange(Const.DATASOURCE_SLAVE)
    public List selectByALLBf() {
        return rdrecord11Mapper.selectByALLRdrecord11();
    }

    //半成品入库接口
    @Override
    @DataSourceChange(Const.DATASOURCE_SLAVE)
    public List selectByALLRdrecord10() {
        return rdrecord10Mapper.selectByALLRdrecord10();
    }

    //物料采购订单接口
    @Override
    @DataSourceChange(Const.DATASOURCE_SLAVE)
    public List selectByALLPOPomain() {
        return pOPomainMapper.selectByALLPOPomain();
    }

    //物料采购订单关闭接口
    @Override
    @DataSourceChange(Const.DATASOURCE_SLAVE)
    public List selectByALLPOPomainGb() {
        return pOPomainMapper.selectByALLPOPomainGb();
    }

    //查询整车采购订单信息
    @Override
    @DataSourceChange(Const.DATASOURCE_SLAVE)
    public List selectByALLPOPomainXs() {
        return pOPomainMapper.selectByALLPOPomainXs();
    }
    @Override
    @DataSourceChange(Const.DATASOURCE_SLAVE)
    public List selectPOPomainByCustomers(String customer) {
        return pOPomainMapper.selectPOPomainByCustomers(customer);
    }


    //生产订单BOM下发接口
    @Override
    @DataSourceChange(Const.DATASOURCE_SLAVE)
    public List selectByALLMomOrderdetail() {
        return momOrderdetailMapper.selectByMomOrderdetail();
    }

    //调拨单审核
    @Override
    @DataSourceChange(Const.DATASOURCE_SLAVE)
    public List selectByALLSH() {
        return transVouchMapper.selectByALLSH();
    }


    //项目
    @Override
    @DataSourceChange(Const.DATASOURCE_SLAVE)
    public List selectByALLFitemss02() {
        return fitemss02Mapper.selectByALL();
    }
    //les-end

    //Dms-bgin
    //整车物料主数据同步接口(Dms)
    @Override
    @DataSourceChange(Const.DATASOURCE_SLAVE)
    public List selectByCH() {
        return dMSInventoryMapper.selectByCH();

    }

    //配件物料主数据同步接口(Dms)
    @Override
    @DataSourceChange(Const.DATASOURCE_SLAVE)
    public List selectByPJ() {
        return dMSInventoryMapper.selectByPJ();

    }


    //配件物料主数据同步接口
    @Override
    @DataSourceChange(Const.DATASOURCE_SLAVE)
    public List selectByPJQT() {
        return dMSInventoryMapper.selectByPJQT();

    }


    //配件物料主数据同步接口
    @Override
    @DataSourceChange(Const.DATASOURCE_SLAVE)
    public List selectByPJCX() {
        return dMSInventoryMapper.selectByPJCX();

    }

    //物料价格同步接口
    @Override
    @DataSourceChange(Const.DATASOURCE_SLAVE)
    public List selectByJG() {
        return priceJustifyMapper.selectByALL();

    }


    //配件出库单接口
    @Override
    @DataSourceChange(Const.DATASOURCE_SLAVE)
    public List selectByPJCK() {
        return rdrecord32Mapper.selectByALLRdrecord32();

    }

    //车辆销司入库接口
    @Override
    @DataSourceChange(Const.DATASOURCE_SLAVE)
    public List selectBySCRK() {
        return rdrecord10Mapper.selectByALLSCRK();

    }

    //车辆销司入库（采购）接口
    @Override
    @DataSourceChange(Const.DATASOURCE_SLAVE)
    public List selectBySCRKCG() {
        return rdrecord01Mapper.selectByALLSCRKCG();

    }

    //ERP开票信息接口
    @Override
    @DataSourceChange(Const.DATASOURCE_SLAVE)
    public List selectByALLSaleBillVouch() {
        return saleBillVouchMapper.selectByALLSaleBillVouch();

    }



    //库存校验信息反馈接口
    @Override
    @DataSourceChange(Const.DATASOURCE_SLAVE)
    public List selectByALLSOSOMain() {
        return sOSOMainMapper.selectByALLSOSOMain();

    }

    //FH单审核
    @Override
    @DataSourceChange(Const.DATASOURCE_SLAVE)
    public List selectByALLFHSH() {
        return dispatchListMapper.selectByALLFHSH();
    }

    //排产计划反馈接口
    @Override
    @DataSourceChange(Const.DATASOURCE_SLAVE)
    public List selectByALLJHFK() {
        return momOrderdetailMapper.selectByMomOrderdetailJHFK();
    }

    //
    @Override
    @DataSourceChange(Const.DATASOURCE_SLAVE01)
    public List selectByPJGYS(String Cinvcode) {
        return dMSInventoryMapper.selectByPJGYS(Cinvcode);
    }

    //
    @Override
    @DataSourceChange(Const.DATASOURCE_SLAVE)
    public List selectByPJGYS(Integer id) {
        return dMSInventoryMapper.selectByPJXCS(id);
    }

    @Override
    @DataSourceChange(Const.DATASOURCE_SLAVE)
    public List selectSomainCurrent() {
        return sOSOMainMapper.selectSomainCurrent();
    }

    @Override
    @DataSourceChange(Const.DATASOURCE_SLAVE01)
    public List selectCheckOrder() {
        return dispatchListMapper.selectCheckOrder();
    }

    @Override
    public List selectBySCRKQT() {
        return this.rdrecord08Mapper.selectByALLSCRKQT();
    }


    @Override
    @DataSourceChange(Const.DATASOURCE_SLAVE)
    public BigDecimal selectCurrent(String cinvcode, Integer autoid) {

        return sOSOMainMapper.selectCurrent(cinvcode, autoid);
    }

    @Override
    public List selectDispatchListByCustomers(String number) {
        return  this.dispatchListMapper.selectDispatchListByCustomers(number);
    }

}
