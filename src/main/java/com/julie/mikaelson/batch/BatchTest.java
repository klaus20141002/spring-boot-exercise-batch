package com.julie.mikaelson.batch;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.julie.mikaelson.fun.We;


@EnableScheduling
public class BatchTest {
	
	
	
	@Scheduled(cron="*/20 * * * * * *")
	public void sayLove() {
		We.sayLove();
	}

}
