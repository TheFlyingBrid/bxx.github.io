package com.sub.dao;

import com.sub.entity.Source;
import com.sub.entity.SourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SourceMapper {
    long countByExample(SourceExample example);

    int deleteByExample(SourceExample example);

    int deleteByPrimaryKey(String id);

    int insert(Source record);

    int insertSelective(Source record);

    List<Source> selectByExampleWithBLOBs(SourceExample example);

    List<Source> selectByExample(SourceExample example);

    Source selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Source record, @Param("example") SourceExample example);

    int updateByExampleWithBLOBs(@Param("record") Source record, @Param("example") SourceExample example);

    int updateByExample(@Param("record") Source record, @Param("example") SourceExample example);

    int updateByPrimaryKeySelective(Source record);

    int updateByPrimaryKeyWithBLOBs(Source record);

    int updateByPrimaryKey(Source record);
}