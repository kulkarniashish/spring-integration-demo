package com.demo.service.impl;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

import com.demo.service.PrintService3;

@Component
public class PrintService3Impl implements PrintService3 {

	@ServiceActivator
	public void print(String str) {
		System.out.println("printing from service3...." + str);
	}

}
