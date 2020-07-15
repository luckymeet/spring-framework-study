package com.study.config;

import org.springframework.context.Lifecycle;

//@Component
public class MyLifecycle implements Lifecycle {

	boolean flag =false;
	@Override
	public void start() {
		System.out.println("start");
		flag = true;
	}

	@Override
	public void stop() {
		System.out.println("stop");
		flag = false;
	}

	@Override
	public boolean isRunning() {
		return flag;
	}
}
