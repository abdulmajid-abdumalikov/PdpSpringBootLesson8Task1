package com.malikov.springbootlesson8task1.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "config")
public class Config {
    private List<String> env;

    // Getters and Setters
}

