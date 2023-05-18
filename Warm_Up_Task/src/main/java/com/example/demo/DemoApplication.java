package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RestController
	@RequestMapping("/api/service/v1")
	public class HelloController {
		@GetMapping("/hello")
		public HelloResponse hello() {
			HelloResponse response = new HelloResponse();
			response.setLang("en");
			response.setGreeting("Hello World!");
			return response;
		}
	}

	public static class HelloResponse {
		private String lang;
		private String greeting;

		// Getters and Setters

		public String getLang() {
			return lang;
		}

		public void setLang(String lang) {
			this.lang = lang;
		}

		public String getGreeting() {
			return greeting;
		}

		public void setGreeting(String greeting) {
			this.greeting = greeting;
		}
	}
}
