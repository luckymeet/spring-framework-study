package com.study.mapper;

import org.apache.ibatis.annotations.Select;

public interface UserDao {

	@Select("select * from user where id = #id")
	public void query(String id);
}
