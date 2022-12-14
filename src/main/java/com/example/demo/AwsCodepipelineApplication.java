package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsCodepipelineApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsCodepipelineApplication.class, args);
	}
	
	@GetMapping("/sayHello")
	public ResponseEntity<?> sayHello(){
		
		return ResponseEntity.ok("Hello From AWS Codepipeline Demo");
	}

}
