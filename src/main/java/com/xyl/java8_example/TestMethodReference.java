package com.xyl.java8_example;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 一般方法的引用格式是 如果是静态方法，则是ClassName::methodName。如 Object ::equals
 * 如果是实例方法，则是Instance::methodName。如Object obj=new Object();obj::equals;
 * 构造函数.则是ClassName::new
 * 
 * @author xieyinglin
 *
 */
public class TestMethodReference {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout());
		frame.setSize(200, 400);
		frame.setVisible(true);

		JButton btn1 = new JButton("点我");
		JButton btn2 = new JButton("也点我");
		frame.getContentPane().add(btn1);
		frame.getContentPane().add(btn2);

		// 这里addActionListener方法的参数是ActionListener，是一个函数式接口
		// 使用lambda表达式方式
		btn1.addActionListener(e -> {
			System.out.println("这里是lambda表达式实现");
		});

		btn2.addActionListener(TestMethodReference::doSomething);

	}

	public static void doSomething(ActionEvent e) {
		System.out.println("这里是方法引用实现方式");
	}

}
