package com.dingyun.springbootcdm.service;

import com.dingyun.springbootcdm.model.System;
import com.dingyun.springbootcdm.model.SystemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemService {
    long countByExample(SystemExample example);

    int deleteByExample(SystemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(System record);

    int insertSelective(System record);

    List<System> selectByExample(SystemExample example);

    System selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") System record, @Param("example") SystemExample example);

    int updateByExample(@Param("record") System record, @Param("example") SystemExample example);

    int updateByPrimaryKeySelective(System record);

    int updateByPrimaryKey(System record);
}