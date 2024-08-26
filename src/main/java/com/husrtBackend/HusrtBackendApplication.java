package com.husrtBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"controllers", "entities", "repositories", "services", "servicesImp", "components"})
public class HusrtBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(HusrtBackendApplication.class, args);
	}

}
