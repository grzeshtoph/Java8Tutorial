package com.java8tutorial.lambdas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Different versions of lambda comparator
 */
public class SortList {
    private static final Logger LOG = LoggerFactory.getLogger(SortList.class);

    private List<String> getNames() {
        return Arrays.asList("peter", "anna", "xena", "mike");
    }

    public List<String> sortOld() {
        List<String> names = getNames();

        LOG.info("sortOld: before sort: {}", names);

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });

        LOG.info("solrtOld: after sort: {}", names);

        return names;
    }

    public List<String> sortLambda1() {
        List<String> names = getNames();

        LOG.info("sortLambda1: before sort: {}", names);

        Collections.sort(names, (String a, String b) -> {
            return b.compareTo(a);
        });

        LOG.info("sortLambda1: after sort: {}", names);

        return names;
    }

    public List<String> sortLambda2() {
        List<String> names = getNames();

        LOG.info("sortLambda2: before sort: {}", names);

        Collections.sort(names, (String a, String b) -> b.compareTo(a));

        LOG.info("sortLambda2: after sort: {}", names);

        return names;
    }

    public List<String> sortLambda3() {
        List<String> names = getNames();

        LOG.info("sortLambda3: before sort: {}", names);

        Collections.sort(names, (a, b) -> {
            return b.compareTo(a);
        } );

        LOG.info("sortLambda3: after sort: {}", names);

        return names;
    }

    public List<String> sortLambda4() {
        List<String> names = getNames();

        LOG.info("sortLambda4: before sort: {}", names);

        Collections.sort(names, (a, b) -> b.compareTo(a));

        LOG.info("sortLambda4: after sort: {}", names);

        return names;
    }
}
