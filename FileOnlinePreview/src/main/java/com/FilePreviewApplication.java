package com;

import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class FilePreviewApplication {
	public static void main(String[] args) {
        Properties properties = System.getProperties();
        System.out.println(properties.get("user.dir"));
        SpringApplication.run(FilePreviewApplication.class, args);
	}
}
