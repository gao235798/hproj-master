package com.espread.sys.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.espread.sys.model.SaSndetailDisp;

/**
* @author Administrator
* @description 针对表【SA_SNDetail_Disp】的数据库操作Mapper
* @createDate 2024-03-27 10:04:05
* @Entity com.espread.sys.model.SaSndetailDisp
*/
public interface SaSndetailDispMapper {

    int deleteByPrimaryKey(Long id);

    int insert(SaSndetailDisp record);

    int insertSelective(SaSndetailDisp record);

    SaSndetailDisp selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SaSndetailDisp record);

    int updateByPrimaryKey(SaSndetailDisp record);

    List<SaSndetailDisp> selectByIdlsid(@Param("idlsid") Integer idlsid);


}
