package com.espread.sys.mapper;

import com.espread.sys.model.POPodetails;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface POPodetailsMapper extends Mapper<POPodetails> {

	List selectByALLPOPodetails(@Param("poid") Integer poid);
	List selectByALLPOPodetailsGb(@Param("poid") Integer poid);
	List selectByALLPOPodetailsXs(@Param("poid") Integer poid);


	POPodetails selectOneByCsocodeAndCinvcode(@Param("csocode") String csocode, @Param("cinvcode") String cinvcode);
}