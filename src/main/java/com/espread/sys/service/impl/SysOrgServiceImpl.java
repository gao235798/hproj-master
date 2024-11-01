package com.espread.sys.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espread.common.web.Tree;
import com.espread.common.web.service.BaseServiceImpl;
import com.espread.sys.mapper.SysOrgMapper;
import com.espread.sys.model.SysOrg;
import com.espread.sys.model.result.SysOrgVo;
import com.espread.sys.service.SysOrgService;

@Service
public class SysOrgServiceImpl extends BaseServiceImpl<SysOrg> implements SysOrgService {

    private static Logger LOGGER = LoggerFactory.getLogger(SysOrgServiceImpl.class);

    @Autowired
    private SysOrgMapper sysOrgMapper;
    
    @Override
	public List<Tree> findOrgAllTree() {
		List<Tree> TreeList = new ArrayList<Tree>();
		List<SysOrg> orgList = sysOrgMapper.findAllOrg();
		for (SysOrg sysOrg : orgList) {
			if (sysOrg != null) {
				Tree tree = new Tree();
				tree.setId(sysOrg.getOrgId());
				tree.setText(sysOrg.getOrgName());
				tree.setPid(sysOrg.getOrgPid());
				TreeList.add(tree);
			}
		}
		return TreeList;
	}
    
	@Override
	public List<SysOrgVo> findAllOrgVo() {
		return sysOrgMapper.findAllOrgVo();
	}
}
