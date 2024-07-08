package br.com.giulianabezerra.stable_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class StableServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StableServiceApplication.class, args);
	}

}

@RestController
class Controller {
	@GetMapping("resource")
	public String resource() {
		return "Stable Service";
	}

}