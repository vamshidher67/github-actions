package com.javatechie.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicdActionsApplication {
	
	@GetMapping
	public String welcome() {
		return "welcome to javatechie";
	}

	public static void main(String[] args) {
		SpringApplication.run(GithubCicdActionsApplication.class, args);
	}
	
	/*
	 * git init git add README.md git commit -m "first commit" git branch -M main
	 * git remote add origin https://github.com/vamshidher67/github-actions.git git
	 * push -u origin main
	 */
    
}
