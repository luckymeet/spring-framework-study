package com.study.mybatis;

import com.study.mapper.UserDao;

public class UserDaoImpl implements UserDao {
	@Override
	public void query(String id) {

//		new LubanInvocationHandler().invoke()
		System.out.println("query logic : " + id );
	}
}
