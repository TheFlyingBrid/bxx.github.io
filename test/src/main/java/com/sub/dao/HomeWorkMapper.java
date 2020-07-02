package com.sub.dao;

import com.sub.entity.HomeWork;
import com.sub.entity.HomeWorkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HomeWorkMapper {
    long countByExample(HomeWorkExample example);

    int deleteByExample(HomeWorkExample example);

    int deleteByPrimaryKey(String id);

    int insert(HomeWork record);

    int insertSelective(HomeWork record);

    List<HomeWork> selectByExampleWithBLOBs(HomeWorkExample example);

    List<HomeWork> selectByExample(HomeWorkExample example);

    HomeWork selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HomeWork record, @Param("example") HomeWorkExample example);

    int updateByExampleWithBLOBs(@Param("record") HomeWork record, @Param("example") HomeWorkExample example);

    int updateByExample(@Param("record") HomeWork record, @Param("example") HomeWorkExample example);

    int updateByPrimaryKeySelective(HomeWork record);

    int updateByPrimaryKeyWithBLOBs(HomeWork record);

    int updateByPrimaryKey(HomeWork record);
}