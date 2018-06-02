package com.psj.psj;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.psj.controller"})
public class Boot01Application {
	private static final Logger logger=LoggerFactory.getLogger(Boot01Application.class);
	public static void main(String[] args) {
		logger.debug("===========boot start=============");
		SpringApplication.run(Boot01Application.class, args);
	}
}
