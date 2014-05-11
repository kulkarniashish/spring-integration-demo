/**
 * 
 */
package com.demo.Main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ashish
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

        // load the Spring context
        new ClassPathXmlApplicationContext("context.xml");
 
//        PrintService1 printService1 = context.getBean("printService1", PrintService1.class);
//        


	}

}
