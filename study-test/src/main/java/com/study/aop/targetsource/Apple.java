package com.study.aop.targetsource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author yuminjun yuminjun@lexiangbao.com
 * @version 1.00
 * @date 2020/9/9 16:56
 * @record <pre>
 * version  author      date      desc
 * -------------------------------------------------
 * 1.00     yuminjun    2020/9/9   新建
 * -------------------------------------------------
 * </pre>
 */
//@Component
public class Apple {

	private int id;

	public Apple(int id) {
		this.id = id;
	}

	public void eat() {
		System.out.println("eat apple, id: " + id);
	}

}
