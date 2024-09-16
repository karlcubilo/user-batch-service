package com.user.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class UserBatchServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserBatchServiceApplication.class, args);
	}

}
