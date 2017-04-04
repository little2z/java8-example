package com.xyl.java8_example;

import java.util.stream.IntStream;

public class TestParallel {
	public static void main(String[] args) {
		
		long t0 = System.nanoTime();
		int[] a = IntStream.range(0, 1000000).filter(i -> i % 2 == 0).toArray();
		
		long t1 = System.nanoTime();
		
		int[] b = IntStream.range(0, 1000000).parallel().filter(i -> i % 2 == 0).toArray();
		
		long t2 = System.nanoTime();
		
		System.out.printf("serial:%.2f Sec,parallel:%.2f Sec.%n",(t1-t0)*1e-9,(t2 - t1)*1e-9);
		
	}
}
