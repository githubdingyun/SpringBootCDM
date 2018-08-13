package com.dingyun.springbootcdm.service;

import com.dingyun.springbootcdm.model.Escore;
import com.dingyun.springbootcdm.model.EscoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EscoreService {
    long countByExample(EscoreExample example);

    int deleteByExample(EscoreExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Escore record);

    int insertSelective(Escore record);

    List<Escore> selectByExample(EscoreExample example);

    Escore selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Escore record, @Param("example") EscoreExample example);

    int updateByExample(@Param("record") Escore record, @Param("example") EscoreExample example);

    int updateByPrimaryKeySelective(Escore record);

    int updateByPrimaryKey(Escore record);
}