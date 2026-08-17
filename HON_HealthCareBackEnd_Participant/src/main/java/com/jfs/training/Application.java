package com.jfs.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main entry point for the CafeConnect Spring Boot backend application.
 *
 * This class:
 * - Boots the Spring context
 * - Enables component scanning
 * - Enables auto-configuration
 * - Starts the embedded Tomcat server
 *
 * Spring Boot Version: 2.7.3
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}