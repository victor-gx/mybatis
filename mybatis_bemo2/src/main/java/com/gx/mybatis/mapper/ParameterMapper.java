package com.gx.mybatis.mapper;

import com.gx.mybatis.pojo.User;

import java.util.List;

public interface ParameterMapper {

	/**
	 * 查询所有的员工信息
	 */
	List<User> getAllUser();
}
