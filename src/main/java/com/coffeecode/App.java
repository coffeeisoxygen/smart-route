package com.coffeecode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        // Test different log levels
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warning message");
        logger.error("This is an error message");

        // Test exception logging
        try {
            throw new RuntimeException("Test exception");
        } catch (RuntimeException e) {
            logger.error("An error occurred", e);
        }

        // Test with formatted message
        String name = "Smart Route";
        logger.info("Application {} is running", name);
    }
}
