package com.xyl.java8_example;

/**
 * 默认方法判断冲突的规则如下：
	1.一个声明在类里面的方法优先于任何默认方法（classes always win）
	2.否则，则会优先选取最具体的实现，比如下面的例子 B重写了A的hello方法
 * @author xieyinglin
 *
 */
public class ClassC implements InterfaceA,InterfaceB {
	
	@Override
	public void hello(){
//		InterfaceA.super.hello();
		System.out.println("hello from C");
	}
	
	public static void main(String[] args) {
		new ClassC().hello();
	}
}
