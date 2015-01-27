package com.java8tutorial.defaultmethods;

/**
 * The interface with a default method.
 */
@FunctionalInterface
public interface Formula {
    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}
