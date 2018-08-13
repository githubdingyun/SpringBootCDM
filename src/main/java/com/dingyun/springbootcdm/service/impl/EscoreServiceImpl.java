package com.dingyun.springbootcdm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dingyun.springbootcdm.dao.EscoreMapper;
import com.dingyun.springbootcdm.model.Escore;
import com.dingyun.springbootcdm.model.EscoreExample;
import com.dingyun.springbootcdm.service.EscoreService;

@Service
public class EscoreServiceImpl implements EscoreService{
   
	@Autowired
	EscoreMapper escoreMapper;

	public long countByExample(EscoreExample example) {
		 
		return 0;
	}

	public int deleteByExample(EscoreExample example) {
		 
		return 0;
	}

	public int deleteByPrimaryKey(Integer id) {
		 
		return 0;
	}

	public int insert(Escore record) {
		 
		return 0;
	}

	public int insertSelective(Escore record) {
		 
		return 0;
	}

	public List<Escore> selectByExample(EscoreExample example) {
		 
		return null;
	}

	public Escore selectByPrimaryKey(Integer id) {
		 
		return null;
	}

	public int updateByExampleSelective(Escore record, EscoreExample example) {
		 
		return 0;
	}

	public int updateByExample(Escore record, EscoreExample example) {
		 
		return 0;
	}

	public int updateByPrimaryKeySelective(Escore record) {
		 
		return 0;
	}

	public int updateByPrimaryKey(Escore record) {
		 
		return 0;
	}
	
}