package com.xyl.java5;

import java.util.ArrayList;

public class Generic {
	
	public static void main(String[] args) {
		Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1 == c2); // true
	}
}
