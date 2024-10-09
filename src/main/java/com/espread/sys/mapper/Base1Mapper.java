package com.espread.sys.mapper;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.espread.sys.model.Department;

import tk.mybatis.mapper.common.Mapper;

public interface Base1Mapper {
	List<LinkedHashMap<String, Object>> select(String sql);

	int insert(String sql);

	int update(String sql);

	int delete(String sql);

	void getUserById(Map<String, Object> parm);
}