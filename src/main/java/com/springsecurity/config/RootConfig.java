package com.springsecurity.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.app")
public class RootConfig {
    // @Bean definitions for services, data sources, etc.
}

