package com.espread.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.espread.sys.model.Department;


import tk.mybatis.mapper.common.Mapper;

public interface DepartmentMapper  extends Mapper<Department> {
	List selectByALL();
	int updateDepartment(@Param("i_id") Integer i_id,@Param("tstatus") String tstatus);
}