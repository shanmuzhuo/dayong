package com.zheng.cms.dao.mapper;

import com.zheng.cms.dao.model.CmsDayong;
import com.zheng.cms.dao.model.CmsDayongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsDayongMapper {
    long countByExample(CmsDayongExample example);

    int deleteByExample(CmsDayongExample example);

    int deleteByPrimaryKey(Integer dayongId);

    int insert(CmsDayong record);

    int insertSelective(CmsDayong record);

    List<CmsDayong> selectByExampleWithBLOBs(CmsDayongExample example);

    List<CmsDayong> selectByExample(CmsDayongExample example);

    CmsDayong selectByPrimaryKey(Integer dayongId);

    int updateByExampleSelective(@Param("record") CmsDayong record, @Param("example") CmsDayongExample example);

    int updateByExampleWithBLOBs(@Param("record") CmsDayong record, @Param("example") CmsDayongExample example);

    int updateByExample(@Param("record") CmsDayong record, @Param("example") CmsDayongExample example);

    int updateByPrimaryKeySelective(CmsDayong record);

    int updateByPrimaryKeyWithBLOBs(CmsDayong record);

    int updateByPrimaryKey(CmsDayong record);
}