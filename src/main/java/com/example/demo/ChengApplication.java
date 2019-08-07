package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com.example.controller")
@ComponentScan("com.example.service")
@MapperScan("com.example.mapper")
@SpringBootApplication
public class ChengApplication {

	public static void main(String[] args) {
	
		SpringApplication.run(ChengApplication.class, args);
	}

}
