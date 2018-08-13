package com.dingyun.springbootcdm.service.impl;

import com.dingyun.springbootcdm.dao.ClazzMapper;
import com.dingyun.springbootcdm.model.Clazz;
import com.dingyun.springbootcdm.model.ClazzExample;
import com.dingyun.springbootcdm.service.ClazzService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClazzServiceImpl implements ClazzService{

	@Autowired
	private ClazzMapper clMapper;
	
	public long countByExample(ClazzExample example) {
		 
		return 0;
	}

	public int deleteByExample(ClazzExample example) {
		 
		return 0;
	}

	public int deleteByPrimaryKey(Integer id) {
		 
		return 0;
	}

	public int insert(Clazz record) {
		 
		return 0;
	}

	public int insertSelective(Clazz record) {
		 
		return 0;
	}

	public List<Clazz> selectByExample(ClazzExample example) {
		 
		return null;
	}

	public Clazz selectByPrimaryKey(Integer id) {
		 
		return null;
	}

	public int updateByExampleSelective(Clazz record, ClazzExample example) {
		 
		return 0;
	}

	public int updateByExample(Clazz record, ClazzExample example) {
		 
		return 0;
	}

	public int updateByPrimaryKeySelective(Clazz record) {
		 
		return 0;
	}

	public int updateByPrimaryKey(Clazz record) {
		 
		return 0;
	}
   
}