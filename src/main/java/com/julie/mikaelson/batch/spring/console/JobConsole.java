package com.julie.mikaelson.batch.spring.console;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class JobConsole {
	
	
	@Scheduled(fixedRate=60*1000*10)
	public void Test1() {
		System.out.println("one time job -- >systime is :"+System.currentTimeMillis());
	}
	
	@Scheduled(cron="* */10 * * * *")
	public void Test2() {
		System.out.println("cycle job ------>systime is :"+System.currentTimeMillis());
	}
	

}
