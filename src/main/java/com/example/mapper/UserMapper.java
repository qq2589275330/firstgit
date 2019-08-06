package com.example.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserMapper {
	@Insert("insert into user values(#{id},#{username},#{password},#{status})")
public int add(@Param("id")String id,@Param("username")String name,@Param("password")String password,@Param("status")int status);
}
