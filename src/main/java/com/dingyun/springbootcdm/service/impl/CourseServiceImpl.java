package com.dingyun.springbootcdm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dingyun.springbootcdm.dao.CourseMapper;
import com.dingyun.springbootcdm.model.Course;
import com.dingyun.springbootcdm.model.CourseExample;
import com.dingyun.springbootcdm.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseMapper courseMapper;
	public long countByExample(CourseExample example) {
		 
		return 0;
	}

	public int deleteByExample(CourseExample example) {
		 
		return 0;
	}

	public int deleteByPrimaryKey(Integer id) {
		 
		return 0;
	}

	public int insert(Course record) {
		 
		return 0;
	}

	public int insertSelective(Course record) {
		 
		return 0;
	}

	public List<Course> selectByExample(CourseExample example) {
		 
		return null;
	}

	public Course selectByPrimaryKey(Integer id) {
		 
		return null;
	}

	public int updateByExampleSelective(Course record, CourseExample example) {
		 
		return 0;
	}

	public int updateByExample(Course record, CourseExample example) {
		 
		return 0;
	}

	public int updateByPrimaryKeySelective(Course record) {
		 
		return 0;
	}

	public int updateByPrimaryKey(Course record) {
		 
		return 0;
	}
  
}