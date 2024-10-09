package com.espread.sys.mapper;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.espread.sys.model.SOSOMain;

import tk.mybatis.mapper.common.Mapper;

public interface SOSOMainMapper  extends Mapper<SOSOMain> {


	List selectByALLSOSOMain();

	
	int updateSOSOMain(@Param("id") Integer id,@Param("cDefine8") String cDefine8);
	
	public List selectSomainCurrent();
	
	BigDecimal selectCurrent(@Param("cinvcode") String cinvcode, @Param("autoid") Integer autoid);
	
	int updateSOSOMainStatus(@Param("autoid") Integer autoid,@Param("cdefine25") String cdefine25);
	
	int updateSosomainChange(@Param("autoid")Integer autoid,@Param("currentIquantity")Integer currentIquantity);

	int closeSOSODetails(@Param("autoid")Integer autoid, @Param("closePeople")String closePeople, @Param("closeDate")String closeDate);

	int closeSOSOmain(@Param("id")Integer id, @Param("closePeople")String closePeople, @Param("closeDate")String closeDate);

	SOSOMain selectByCsocode(@Param("csocode") String csocode);
	
}