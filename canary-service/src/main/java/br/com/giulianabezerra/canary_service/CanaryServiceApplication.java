package br.com.giulianabezerra.canary_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CanaryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CanaryServiceApplication.class, args);
	}

}

@RestController
class Controller {
	@GetMapping("resource")
	public String resource() {
		return "Canary Service";
	}

}
