package com.study.services;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author yuminjun yuminjun@lexiangbao.com
 * @version 1.00
 * @date 2020/9/7 11:49
 * @record <pre>
 * version  author      date      desc
 * -------------------------------------------------
 * 1.00     yuminjun    2020/9/7   新建
 * -------------------------------------------------
 * </pre>
 */
//@Service
public class UserServiceImpl implements UserService {

	@PostConstruct
	public void init() {
		System.out.println("userService PostConstruct is invoke");
	}

	public UserServiceImpl() {
		System.out.println("userService bean is create");
	}

	@Override
	public void update(String s) {
		System.out.println("userService#update is invoke");
	}
}
