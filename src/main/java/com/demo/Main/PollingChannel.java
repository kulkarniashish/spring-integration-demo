/**
 * 
 */
package com.demo.Main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ashish
 *
 */
public class PollingChannel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("classpath:spring-integration-config.xml");

	}

}
