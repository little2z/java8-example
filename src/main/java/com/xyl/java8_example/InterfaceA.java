package com.xyl.java8_example;

public interface InterfaceA {
	default void hello(){
		System.out.println("Hello From A");
	}
}
