package com.java8tutorial.lambdas;

/**
 * Functional interface of values converter.
 */
@FunctionalInterface
public interface Converter<I, O> {
    O convert(I input);
}
