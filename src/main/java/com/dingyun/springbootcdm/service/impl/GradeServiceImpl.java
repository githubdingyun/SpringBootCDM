package com.dingyun.springbootcdm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dingyun.springbootcdm.dao.GradeMapper;
import com.dingyun.springbootcdm.model.GradeCourse;
import com.dingyun.springbootcdm.model.GradeCourseExample;
import com.dingyun.springbootcdm.service.GradeCourseService;
@Service
public class GradeServiceImpl implements GradeCourseService {
   @Autowired
   GradeMapper gradeMapper;

public long countByExample(GradeCourseExample example) {
	 
	return 0;
}

public int deleteByExample(GradeCourseExample example) {
	 
	return 0;
}

public int deleteByPrimaryKey(Integer id) {
	 
	return 0;
}

public int insert(GradeCourse record) {
	 
	return 0;
}

public int insertSelective(GradeCourse record) {
	 
	return 0;
}

public List<GradeCourse> selectByExample(GradeCourseExample example) {
	 
	return null;
}

public GradeCourse selectByPrimaryKey(Integer id) {
	 
	return null;
}

public int updateByExampleSelective(GradeCourse record, GradeCourseExample example) {
	 
	return 0;
}

public int updateByExample(GradeCourse record, GradeCourseExample example) {
	 
	return 0;
}

public int updateByPrimaryKeySelective(GradeCourse record) {
	 
	return 0;
}

public int updateByPrimaryKey(GradeCourse record) {
	 
	return 0;
}
   
}