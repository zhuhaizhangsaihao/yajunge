package com.jt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

//Lombok插件在.java文件编译为.class文件时生效.
@Data //get/set/toString
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true) //重写的set方法
public class User {
	private Integer id;
	private String name;
	private Integer age;
	private String sex;
	
	//为了实现链式加载方式,需要重写set方法.
	/*
	 * public User setId(Integer id) {
	 * 
	 * this.id = id; return this; }
	 */
	
	
	
	
}
