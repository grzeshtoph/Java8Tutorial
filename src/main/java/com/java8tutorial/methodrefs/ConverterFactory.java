package com.java8tutorial.methodrefs;

import com.java8tutorial.lambdas.Converter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Creates different converters
 */
public class ConverterFactory {
    private static final Logger LOG = LoggerFactory.getLogger(ConverterFactory.class);

    public Converter<String, Integer> createStringToIntConverter() {
        LOG.info("createStringToIntConverter");
        return Integer::valueOf;
    }

    public Converter<String, Boolean> createStringToBooleanConverter() {
        LOG.info("createStringToBooleanConverter");
        return Boolean::valueOf;
    }

    public Converter<String, String> createStringAppendConverter() {
        LOG.info("createStringAppendConverter");
        return new TextAppender()::appendABC;
    }

    public Converter<Object, String> createObjectAppendConverter() {
        LOG.info("createObjectAppendConverter");
        return new TextAppender()::appendABC;
    }

    private static class TextAppender {
        private static final Logger LOG = LoggerFactory.getLogger(TextAppender.class);

        String appendABC(String s) {
            LOG.info("appendABC(String)");
            return "ABC" + s;
        }

        String appendABC(Object o) {
            LOG.info("appendABC(Object)");
            return "ABC" + String.valueOf(o);
        }
    }
}
