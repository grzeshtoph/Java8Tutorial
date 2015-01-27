package com.java8tutorial.defaultmethods;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Some factory using inline implementation of {@link Formula}.
 */
public class InlineMultiplicationFormulaFactory {
    private static final Logger LOG = LoggerFactory.getLogger(InlineMultiplicationFormulaFactory.class);

    public Formula createFormula() {
        LOG.info("Create an inlineFormula");

        return (a) -> (a * 100);
    }
}
