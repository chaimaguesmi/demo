package com.example.demo.Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class BonjourBean {
    @Bean
    public String sayBonjour() {
        return "Bonjour Ioc from Bean";
    }}

