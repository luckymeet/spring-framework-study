package com.study.services;

//@Component
public class IndexService {

	String name;

//	public IndexService(BeanService beanService){
//		System.out.println(beanService);
//	}

	public void query(){
		System.out.println("query");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
