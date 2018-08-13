package com.dingyun.springbootcdm.dao;

import com.dingyun.springbootcdm.model.GradeCourse;
import com.dingyun.springbootcdm.model.GradeCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;



public interface GradeCourseMapper {
    long countByExample(GradeCourseExample example);

    int deleteByExample(GradeCourseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GradeCourse record);

    int insertSelective(GradeCourse record);

    List<GradeCourse> selectByExample(GradeCourseExample example);

    GradeCourse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GradeCourse record, @Param("example") GradeCourseExample example);

    int updateByExample(@Param("record") GradeCourse record, @Param("example") GradeCourseExample example);

    int updateByPrimaryKeySelective(GradeCourse record);

    int updateByPrimaryKey(GradeCourse record);
}