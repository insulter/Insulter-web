package com.insulter.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
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
