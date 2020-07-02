package com.sub.dao;

import com.sub.entity.UserHomeWork;
import com.sub.entity.UserHomeWorkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserHomeWorkMapper {
    long countByExample(UserHomeWorkExample example);

    int deleteByExample(UserHomeWorkExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserHomeWork record);

    int insertSelective(UserHomeWork record);

    List<UserHomeWork> selectByExampleWithBLOBs(UserHomeWorkExample example);

    List<UserHomeWork> selectByExample(UserHomeWorkExample example);

    UserHomeWork selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserHomeWork record, @Param("example") UserHomeWorkExample example);

    int updateByExampleWithBLOBs(@Param("record") UserHomeWork record, @Param("example") UserHomeWorkExample example);

    int updateByExample(@Param("record") UserHomeWork record, @Param("example") UserHomeWorkExample example);

    int updateByPrimaryKeySelective(UserHomeWork record);

    int updateByPrimaryKeyWithBLOBs(UserHomeWork record);

    int updateByPrimaryKey(UserHomeWork record);
}