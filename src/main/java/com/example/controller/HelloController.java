package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.UserService;

@RestController
@RequestMapping("helloworld")
public class HelloController {
	@Value("${springpath}")
	@Autowired
	private String path;
	@Autowired
	private UserService UserService;
	@RequestMapping("/add")
public int add(String id, String name, String password, int status) {
	return UserService.add(id, name, password, status);
}
}
