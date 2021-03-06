package com.dingyun.springbootcdm.service;

import com.dingyun.springbootcdm.model.ClazzCourseTeacher;
import com.dingyun.springbootcdm.model.ClazzCourseTeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClazzCourseTeacherService {
    long countByExample(ClazzCourseTeacherExample example);

    int deleteByExample(ClazzCourseTeacherExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClazzCourseTeacher record);

    int insertSelective(ClazzCourseTeacher record);

    List<ClazzCourseTeacher> selectByExample(ClazzCourseTeacherExample example);

    ClazzCourseTeacher selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClazzCourseTeacher record, @Param("example") ClazzCourseTeacherExample example);

    int updateByExample(@Param("record") ClazzCourseTeacher record, @Param("example") ClazzCourseTeacherExample example);

    int updateByPrimaryKeySelective(ClazzCourseTeacher record);

    int updateByPrimaryKey(ClazzCourseTeacher record);
}