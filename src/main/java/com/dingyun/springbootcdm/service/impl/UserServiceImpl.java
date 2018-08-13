package com.dingyun.springbootcdm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dingyun.springbootcdm.dao.UserMapper;
import com.dingyun.springbootcdm.model.User;
import com.dingyun.springbootcdm.model.UserExample;
import com.dingyun.springbootcdm.service.UserService;

@Service
public class UserServiceImpl implements UserService{
   
	@Autowired
	UserMapper userMapper;

	public long countByExample(UserExample example) {
		 
		return 0;
	}

	public int deleteByExample(UserExample example) {
		 
		return 0;
	}

	public int deleteByPrimaryKey(Integer id) {
		 
		return 0;
	}

	public int insert(User record) {
		 
		return 0;
	}

	public int insertSelective(User record) {
		 
		return 0;
	}

	public List<User> selectByExample(UserExample example) {
		 
		return null;
	}

	public User selectByPrimaryKey(Integer id) {
		 
		return null;
	}

	public int updateByExampleSelective(User record, UserExample example) {
		 
		return 0;
	}

	public int updateByExample(User record, UserExample example) {
		 
		return 0;
	}

	public int updateByPrimaryKeySelective(User record) {
		 
		return 0;
	}

	public int updateByPrimaryKey(User record) {
		 
		return 0;
	}
	
}