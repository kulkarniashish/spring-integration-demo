package com.demo.service.impl;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

import com.demo.service.PrintService2;

@Component
public class PrintService2Impl implements PrintService2 {

	@ServiceActivator
	public String print(String str) {
		System.out.println("printing from service2...." + str);
		return str + " bangalore";
	}

}
