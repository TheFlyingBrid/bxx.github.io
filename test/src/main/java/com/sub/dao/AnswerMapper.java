package com.sub.dao;

import com.sub.entity.Answer;
import com.sub.entity.AnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnswerMapper {
    long countByExample(AnswerExample example);

    int deleteByExample(AnswerExample example);

    int deleteByPrimaryKey(String id);

    int insert(Answer record);

    int insertSelective(Answer record);

    List<Answer> selectByExampleWithBLOBs(AnswerExample example);

    List<Answer> selectByExample(AnswerExample example);

    Answer selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Answer record, @Param("example") AnswerExample example);

    int updateByExampleWithBLOBs(@Param("record") Answer record, @Param("example") AnswerExample example);

    int updateByExample(@Param("record") Answer record, @Param("example") AnswerExample example);

    int updateByPrimaryKeySelective(Answer record);

    int updateByPrimaryKeyWithBLOBs(Answer record);

    int updateByPrimaryKey(Answer record);
}