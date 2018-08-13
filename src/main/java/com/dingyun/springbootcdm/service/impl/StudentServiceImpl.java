package com.dingyun.springbootcdm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dingyun.springbootcdm.dao.StudentMapper;
import com.dingyun.springbootcdm.model.Student;
import com.dingyun.springbootcdm.model.StudentExample;
import com.dingyun.springbootcdm.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentMapper studentMapper;

	public long countByExample(StudentExample example) {
		 
		return 0;
	}

	public int deleteByExample(StudentExample example) {
		 
		return 0;
	}

	public int deleteByPrimaryKey(Integer id) {
		 
		return 0;
	}

	public int insert(Student record) {
		 
		return 0;
	}

	public int insertSelective(Student record) {
		 
		return 0;
	}

	public List<Student> selectByExampleWithBLOBs(StudentExample example) {
		 
		return null;
	}

	public List<Student> selectByExample(StudentExample example) {
		 
		return null;
	}

	public Student selectByPrimaryKey(Integer id) {
		 
		return null;
	}

	public int updateByExampleSelective(Student record, StudentExample example) {
		 
		return 0;
	}

	public int updateByExampleWithBLOBs(Student record, StudentExample example) {
		 
		return 0;
	}

	public int updateByExample(Student record, StudentExample example) {
		 
		return 0;
	}

	public int updateByPrimaryKeySelective(Student record) {
		 
		return 0;
	}

	public int updateByPrimaryKeyWithBLOBs(Student record) {
		 
		return 0;
	}

	public int updateByPrimaryKey(Student record) {
		 
		return 0;
	}
    

}