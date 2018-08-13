package com.dingyun.springbootcdm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dingyun.springbootcdm.dao.ExamMapper;
import com.dingyun.springbootcdm.model.Exam;
import com.dingyun.springbootcdm.model.ExamExample;
import com.dingyun.springbootcdm.service.ExamService;

@Service
public class ExamServiceImpl implements ExamService{
  
	@Autowired
	ExamMapper examMapper;

	public long countByExample(ExamExample example) {
		 
		return 0;
	}

	public int deleteByExample(ExamExample example) {
		 
		return 0;
	}

	public int deleteByPrimaryKey(Integer id) {
		 
		return 0;
	}

	public int insert(Exam record) {
		 
		return 0;
	}

	public int insertSelective(Exam record) {
		 
		return 0;
	}

	public List<Exam> selectByExample(ExamExample example) {
		 
		return null;
	}

	public Exam selectByPrimaryKey(Integer id) {
		 
		return null;
	}

	public int updateByExampleSelective(Exam record, ExamExample example) {
		 
		return 0;
	}

	public int updateByExample(Exam record, ExamExample example) {
		 
		return 0;
	}

	public int updateByPrimaryKeySelective(Exam record) {
		 
		return 0;
	}

	public int updateByPrimaryKey(Exam record) {
		 
		return 0;
	}
	
}