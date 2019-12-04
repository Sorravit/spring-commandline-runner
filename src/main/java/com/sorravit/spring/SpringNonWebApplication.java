package com.sorravit.spring;

import com.sorravit.spring.service.NonWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringNonWebApplication implements CommandLineRunner {

	@Autowired
	NonWebService nonWebService;

    public static void main(String[] args) {
        SpringApplication.run(SpringNonWebApplication.class, args);
		System.out.println("Pizza");
    }


	@Override
	public void run(String... args) throws Exception {
		nonWebService.printSomething();
	}
}
