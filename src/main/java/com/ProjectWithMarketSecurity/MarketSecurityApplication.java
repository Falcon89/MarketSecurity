package com.ProjectWithMarketSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@SpringBootApplication
public class MarketSecurityApplication  {

	public static void main(String[] args) {
		SpringApplication.run(MarketSecurityApplication.class, args);
	}
}
