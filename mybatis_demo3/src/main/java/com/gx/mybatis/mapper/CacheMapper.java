package com.gx.mybatis.mapper;

import com.gx.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

public interface CacheMapper {

	Emp getEmpByEid(@Param("eid") Integer eid);

	void insertEmp(Emp emp);
}
