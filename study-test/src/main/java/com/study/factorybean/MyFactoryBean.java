package com.study.factorybean;

import com.study.services.BeanService;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.cglib.proxy.Proxy;

public class MyFactoryBean implements FactoryBean {

	Class mapperInterface;

	public void setMapperInterface(Class mapperInterface) {
		this.mapperInterface = mapperInterface;
	}

	@Override
	public Object getObject() throws Exception {
		// 根据接口实例化代理对象
		return Proxy.newProxyInstance(null,null,null);
//		return new BeanService();
	}

	@Override
	public Class<?> getObjectType() {
		return BeanService.class;
	}
}
