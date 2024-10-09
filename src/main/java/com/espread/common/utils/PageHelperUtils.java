package com.espread.common.utils;

import com.espread.common.web.PageInfo;
import com.github.pagehelper.PageHelper;

/**
 * 分页工具
 *
 * @author itdragons 2016-09-03 23:35:39
 */
public class PageHelperUtils {

    public static void startPage(PageInfo pageInfo) {
        PageHelper.startPage(pageInfo.getNowpage(), pageInfo.getPagesize());
    }

    public static void startPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
    }

}
