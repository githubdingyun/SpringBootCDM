package com.dingyun.springbootcdm.service;

import com.dingyun.springbootcdm.model.Course;
import com.dingyun.springbootcdm.model.CourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseService {
    long countByExample(CourseExample example);

    int deleteByExample(CourseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Course record);

    int insertSelective(Course record);

    List<Course> selectByExample(CourseExample example);

    Course selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Course record, @Param("example") CourseExample example);

    int updateByExample(@Param("record") Course record, @Param("example") CourseExample example);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
}