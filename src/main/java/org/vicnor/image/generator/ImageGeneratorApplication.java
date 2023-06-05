package org.vicnor.image.generator;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import org.springframework.boot.SpringApplication;

@SpringBootApplication
@EnableFeignClients
public class ImageGeneratorApplication {
    public static void main(String[] args) {
        SpringApplication.run(ImageGeneratorApplication.class, args);
    }
}

