package com.study.circulardependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {

	// OrderService使用JDK动态代理时这里声明的类型必须是接口 I，否则会找不到bean，因为容器中是OrderService的代理对象
	@Autowired
	I orderService;

	public ProductService(){
		System.out.println("productService bean is create");
	}

	public void test() {
		System.out.println("productService.test() start");
		orderService.testAop();
		this.privateMethod();
		System.out.println("productService.test() end");
	}

	private void privateMethod() {
		System.out.println("private Method aop test");
	}

}
