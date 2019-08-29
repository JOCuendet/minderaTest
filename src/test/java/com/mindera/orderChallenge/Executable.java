package com.mindera.orderChallenge;


import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.collections.Lists;

import java.util.List;

public class Executable {

    public static void main(String[] args) {
        System.out.println("this works!");

        TestListenerAdapter tla = new TestListenerAdapter();
        TestNG testng = new TestNG();
        List<String> suites = Lists.newArrayList();
        suites.add("smokeTests.xml");
        testng.setTestSuites(suites);
        testng.run();
    }
}
