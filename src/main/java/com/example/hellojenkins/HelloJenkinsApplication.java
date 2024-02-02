package com.example.hellojenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloJenkinsApplication.class, args);
	}

	@GetMapping(value = "/")
	public void hello(){
		System.out.println("hello jenkins");
	}
}
