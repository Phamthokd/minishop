package com.thuongmaidientu.minishop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.thuongmaidientu"})
public class MinishopApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinishopApplication.class, args);
	}

}
