package com.java8tutorial.defaultmethods;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Simple implementation of {@link Formula} interface.
 */
public class DuplicationFormulaImpl implements Formula {
    private static final Logger LOG = LoggerFactory.getLogger(DuplicationFormulaImpl.class);

    @Override
    public double calculate(int a) {
        LOG.info("Calculate of DuplicationFormulaImpl");

        return a * 2;
    }
}
