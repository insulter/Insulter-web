package com.insulter.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@EnableEurekaClient
@RestController
public class InsulterWebApplication {

    @RequestMapping(value = "/")
    public String insultMe() {
    	String insult = "insult me";
        return insult;
    }

	public static void main(String[] args) {
		SpringApplication.run(InsulterWebApplication.class, args);
	}
}
