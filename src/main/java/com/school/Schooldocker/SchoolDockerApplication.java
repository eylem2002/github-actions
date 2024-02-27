package com.school.Schooldocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@SpringBootApplication
@RestController
public class SchoolDockerApplication {
@GetMapping("/welcome")
	public String welcome(){
	return "Welcome ";
}
	public static void main(String[] args) {
		SpringApplication.run(SchoolDockerApplication.class, args);
	}

}
//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin https://github.com/eylem2002/github-actions.git
//git push -u origin main