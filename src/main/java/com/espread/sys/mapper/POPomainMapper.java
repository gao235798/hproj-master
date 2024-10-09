package com.espread.sys.mapper;

import com.espread.sys.model.POPomain;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface POPomainMapper   extends Mapper<POPomain> {
	List selectByALLPOPomain();


	int updatePOPomain(@Param("poid") Integer poid,@Param("cDefine8") String cDefine8);


	List selectByALLPOPomainGb();

	List selectByALLPOPomainXs();
	List selectPOPomainByCustomers(@Param("customer") String  customer);

	List<POPomain> selectByCpoid(@Param("cpoid") String cpoid);

	int updatePOPomainGb(@Param("poid") Integer poid,@Param("cDefine24") String cDefine24);

	int updatePOPomainxs(@Param("poid") Integer poid,@Param("cDefine17") String cDefine17,@Param("cDefine18") String cDefine18);
}