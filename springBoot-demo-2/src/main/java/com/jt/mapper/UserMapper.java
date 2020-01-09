package com.jt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import com.jt.pojo.User;
//@Mapper	//将接口交给spring容器管理 代理对象
public interface UserMapper {
	
	List<User> findAll();

	List<User> findByAge(int minAge, int maxAge);

	List<User> findUser(User user);
	
	
	
	
	
}
