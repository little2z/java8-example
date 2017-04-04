package com.xyl.java8_example;

public interface InterfaceB extends InterfaceA{
	default void hello(){
		System.out.println("Hello From B");
	}
}
