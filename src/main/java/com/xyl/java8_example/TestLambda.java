package com.xyl.java8_example;

public class TestLambda {
	
	public static void runThreadUseLambda(){
		
		new Thread(()-> System.out.println("lambda实现的线程")).start();
	}
	
	public static void runThreadUseInnerClass(){
		
		new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println("内部类实现的线程");
			}
			
		}).start();
		
	}
	
	public static void main(String[] args) {
		
		TestLambda.runThreadUseInnerClass();
		TestLambda.runThreadUseLambda();
		
	}
}
