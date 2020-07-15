package com.study.services;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class X {
	public X() {
		System.out.println("x constructor");
	}

	@Bean
	public Y y() {
		return new Y();
	}
}
