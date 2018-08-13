package com.dingyun.springbootcdm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dingyun.springbootcdm.dao.SystemMapper;
import com.dingyun.springbootcdm.model.System;
import com.dingyun.springbootcdm.model.SystemExample;
import com.dingyun.springbootcdm.service.SystemService;

@Service
public class SystemServiceImpl implements SystemService{
  @Autowired
  SystemMapper systemMapper;

public long countByExample(SystemExample example) {
	 
	return 0;
}

public int deleteByExample(SystemExample example) {
	 
	return 0;
}

public int deleteByPrimaryKey(Integer id) {
	 
	return 0;
}

public int insert(System record) {
	 
	return 0;
}

public int insertSelective(System record) {
	 
	return 0;
}

public List<System> selectByExample(SystemExample example) {
	 
	return null;
}

public System selectByPrimaryKey(Integer id) {
	 
	return null;
}

public int updateByExampleSelective(System record, SystemExample example) {
	 
	return 0;
}

public int updateByExample(System record, SystemExample example) {
	 
	return 0;
}

public int updateByPrimaryKeySelective(System record) {
	 
	return 0;
}

public int updateByPrimaryKey(System record) {
	 
	return 0;
}
  
}