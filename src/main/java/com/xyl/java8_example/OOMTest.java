package com.xyl.java8_example;

import java.io.File;
import java.lang.management.ClassLoadingMXBean;
import java.lang.management.ManagementFactory;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

public class OOMTest {
	
	public static void main(String[] args) {
		
		try {
			URL url = new File("D:/").toURI().toURL();
			URL[] urls = {url};
			ClassLoadingMXBean classLoadingMXBean = ManagementFactory.getClassLoadingMXBean();
			List<ClassLoader> classLoaders = new ArrayList<ClassLoader>();
			while(true){
				ClassLoader classLoader = new URLClassLoader(urls);
				classLoaders.add(classLoader);
				classLoader.loadClass("TestClass");
				System.out.println("total:"+classLoadingMXBean.getTotalLoadedClassCount());//总共一起加载的类数目
				System.out.println("active:"+classLoadingMXBean.getLoadedClassCount());//当前已经加载的类数目
				System.out.println("unloaded:"+classLoadingMXBean.getUnloadedClassCount());//当前已经卸载的类数目
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
