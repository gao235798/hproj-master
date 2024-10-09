package com.espread.sys.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.espread.common.constant.Const;
import com.espread.common.utils.ServletUtils;
import com.espread.common.web.PageInfo;
import com.espread.common.web.controller.BaseController;
import com.espread.sys.model.result.SysUserVo;
import com.espread.sys.service.SysDictService;
import com.espread.sys.service.SysLogService;
import com.espread.sys.service.SysQtrzLogService;

/**
 * 日志查询
 *
 * @author itdragons 2016-09-17 18:02:23
 */
@Controller
@RequestMapping(value = "sysQrtzLog")
public class SysQrtzLogController extends BaseController {

    @Autowired
    private SysQtrzLogService sysQtrzLogService;

    @Autowired
    private SysDictService sysDictService;

    /**
     * 所有日志类型-tree
     *
     * @return
     */
    @RequestMapping("/allTypeTree/json")
    @ResponseBody
    public Object allTypeTree() {
        return sysDictService.findDictAllTree(Const.DICT_TYPE_QTRZ_LOG_TYPE);
    }

    /**
     * 日志查询页面
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String manager() {
        return "sys/sysQtrzLog";
    }

    /**
     * 日志列表
     *
     * @param page
     * @param rows
     * @param sort
     * @param order
     * @return
     */
    @RequiresPermissions("sys:qtrzlog:view")
    @RequestMapping(value = "/dataGrid/json", method = RequestMethod.POST)
    @ResponseBody
    public Object dataGrid(SysUserVo sysUserVo, Integer page, Integer rows, String sort, String order, HttpServletRequest request) {
        PageInfo pageInfo = new PageInfo(page, rows, sort, order);
        Map<String, Object> condition = ServletUtils.getParmFilter(request);
        pageInfo.setPageResult(sysQtrzLogService.findDataGrid(pageInfo, condition));
        return pageInfo;
    }

    /**
     * 定时器重发
     *
     * @param id
     * @return
     */
    @RequiresPermissions("sys:qtrzLog:edit")
    @RequestMapping("/edit")
    @ResponseBody
    public Object edit(String code, String logType) {
        sysQtrzLogService.uDanju(code, logType);
        return resultSuccess("设置成功！数据将在下次队里中重发！");
    }
}
