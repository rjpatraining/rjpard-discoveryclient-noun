package com.rjpard.discoveryclient.noun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RjpardDiscoveryclientNounApplication {

	public static void main(String[] args) {
		SpringApplication.run(RjpardDiscoveryclientNounApplication.class, args);
	}
}
