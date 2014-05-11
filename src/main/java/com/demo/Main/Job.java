package com.demo.Main;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.demo.service.PrintService1;
 
/**
 * Job that every n-seconds generates invoices and sends them to the system.
 * In real world this might be endpoint receiving invoices from another system.
 */
@Component
public class Job {
 
	@Autowired
	PrintService1 printService1;
	
    @Scheduled(fixedRate = 4000)
    public void schedule() {
        System.out.println("\nStarting...");
        
        printService1.print("Hello ");
    }
}