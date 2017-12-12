package com.demo.webservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.files.StorageService;
import com.demo.files.storage.StorageProperties;

@SpringBootApplication
@Controller
public class Application {
	@RequestMapping("/")
    @ResponseBody
     String index() {
		return " this is webservice index";
	}
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
