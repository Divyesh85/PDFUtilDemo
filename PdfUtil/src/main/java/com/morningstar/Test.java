package com.morningstar;

import java.util.List;

import org.testng.TestNG;
import org.testng.collections.Lists;

public class Test {
	public static void main(String args[]) {
		try {
			TestNG testng = new TestNG();
	        List suites = Lists.newArrayList();
	        suites.add("testng.xml"); 
	        testng.setTestSuites(suites);
	        testng.run();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
