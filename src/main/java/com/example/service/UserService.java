package com.example.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entry.User;
import com.example.mapper.UserMapper;
@Service
public class UserService { 
	@Autowired
	private UserMapper userMapper;
	public int add(String id,String name,String password,int status){
		return userMapper.add(id, name, password, status);
		
	}
	public User selectUser() {
		return userMapper.selectUser();
		
	}
}
