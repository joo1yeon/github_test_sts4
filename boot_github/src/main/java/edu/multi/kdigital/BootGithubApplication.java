package edu.multi.kdigital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootGithubApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootGithubApplication.class, args);
		System.out.println("github push");
	}

}
