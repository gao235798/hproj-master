package com.espread.sys.mapper;

import com.espread.sys.model.DispatchList;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface DispatchListMapper extends Mapper<DispatchList> {
	List selectByALLFHSH();

	List selectCheckOrder();

	List selectDispatchListByCustomers(@Param("csocode") String number);

	int updateDispatchList(@Param("DLID") Integer DLID, @Param("cDefine8") String cDefine8);

	int updatecdefine17(@Param("DLID") Integer DLID, @Param("cDefine17") String cDefine17);

	DispatchList selectByDlid(@Param("dlid") Integer dlid);

	DispatchList selectByCdlcode(@Param("cdlcode") String cdlcode);

	int updateCsocodeByDlid(@Param("csocode") String csocode, @Param("dlid") Integer dlid);

	int updatecdefine18(@Param("DLID") Integer DLID, @Param("cDefine18") String cDefine17);


}