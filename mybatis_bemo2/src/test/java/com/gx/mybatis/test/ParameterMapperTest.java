package com.gx.mybatis.test;

import com.gx.mybatis.mapper.ParameterMapper;
import com.gx.mybatis.pojo.User;
import com.gx.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class ParameterMapperTest {

	@Test
	public void testGetAllUser(){
		SqlSession sqlSession = SqlSessionUtils.getSqlSession();
		ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
		List<User> list = mapper.getAllUser();
		list.forEach(user -> System.out.println(user));
	}
}
