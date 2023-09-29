package com.template.setup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class WebAppTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebAppTemplateApplication.class, args);
    }

}
