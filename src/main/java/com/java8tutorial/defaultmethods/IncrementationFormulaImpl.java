package com.java8tutorial.defaultmethods;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The implementation of {@link Formula} interface that overrides also the sqrt method.
 */
public class IncrementationFormulaImpl implements Formula {
    private final static Logger LOG = LoggerFactory.getLogger(IncrementationFormulaImpl.class);

    @Override
    public double calculate(int a) {
        LOG.info("Calculate of IncrementationFormulaImpl");

        return a+1;
    }

    @Override
    public double sqrt(int a) {
        LOG.info("Sqrt of IncrementationFormulaImpl");

        return a+1;
    }
}
