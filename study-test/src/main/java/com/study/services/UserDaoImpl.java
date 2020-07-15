package com.study.services;

import com.study.mapper.UserDao;

public class UserDaoImpl implements UserDao {
	@Override
	public void query(String id) {
		System.out.println("userdao logic : " + id);
	}

	public void log(){
		System.out.println("log");
	}
}
