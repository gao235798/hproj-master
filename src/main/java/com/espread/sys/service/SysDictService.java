package com.espread.sys.service;

import java.util.List;

import com.espread.common.web.Tree;
import com.espread.common.web.service.BaseService;
import com.espread.sys.model.SysDict;
import com.espread.sys.model.result.SysDictVo;

/**
 * 字典管理
 *
 * @author itdragons 2016-8-12 15:28:51
 */
public interface SysDictService extends BaseService<SysDict> {

    //查找字典
    List<SysDictVo> findDictAllVo(String dictType);
    
    /**
	 * 获取所有字典树
	 * @return
	 */
	public List<Tree> findDictAllTree(String dictType);

}
