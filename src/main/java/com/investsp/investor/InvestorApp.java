package com.investsp.investor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by deepan on 3/23/15.
 */
@SpringBootApplication
public class InvestorApp extends SpringBootServletInitializer{

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(InvestorApp.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(InvestorApp.class, args);
    }
}
