package edu.multi.kdigital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootGithubApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootGithubApplication.class, args);
		System.out.println("github push");
		System.out.println("원격 저장소 추가 라인");
		System.out.println("소스 주인 추가 라인");
	}

}
