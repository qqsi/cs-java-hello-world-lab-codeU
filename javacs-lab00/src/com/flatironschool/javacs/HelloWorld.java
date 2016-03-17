package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        // I won't work!
		double version = Double.parseDouble(
			System.getProperty("java.specification.version"));
		System.out.println(version);
 		return version;
    }

    public static void main(String[] args) {
	    System.out.println(getVersion());
		System.out.println("This is from the main method...");
    }
}
