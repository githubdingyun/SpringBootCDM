package com.dingyun.springbootcdm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dingyun.springbootcdm.dao.TeacherMapper;
import com.dingyun.springbootcdm.model.Teacher;
import com.dingyun.springbootcdm.model.TeacherExample;
import com.dingyun.springbootcdm.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {
   @Autowired
   TeacherMapper teacherMapper;

public long countByExample(TeacherExample example) {
	 
	return 0;
}

public int deleteByExample(TeacherExample example) {
	 
	return 0;
}

public int deleteByPrimaryKey(Integer id) {
	 
	return 0;
}

public int insert(Teacher record) {
	 
	return 0;
}

public int insertSelective(Teacher record) {
	 
	return 0;
}

public List<Teacher> selectByExampleWithBLOBs(TeacherExample example) {
	 
	return null;
}

public List<Teacher> selectByExample(TeacherExample example) {
	 
	return null;
}

public Teacher selectByPrimaryKey(Integer id) {
	 
	return null;
}

public int updateByExampleSelective(Teacher record, TeacherExample example) {
	 
	return 0;
}

public int updateByExampleWithBLOBs(Teacher record, TeacherExample example) {
	 
	return 0;
}

public int updateByExample(Teacher record, TeacherExample example) {
	 
	return 0;
}

public int updateByPrimaryKeySelective(Teacher record) {
	 
	return 0;
}

public int updateByPrimaryKeyWithBLOBs(Teacher record) {
	 
	return 0;
}

public int updateByPrimaryKey(Teacher record) {
	 
	return 0;
}
   
}