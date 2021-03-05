package com.wani.springresttemplate.responseheaders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class SpringResttemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringResttemplateApplication.class, args);
    }

}
