package com.example;

public class ThreadSchedulingDemo {

	public static void main(String[] args) {

		MyRunnable nr = new MyRunnable();
		Thread t1 = new Thread(nr, "Subham");
		Thread t2 = new Thread(nr, "Sweta");
		Thread t3 = new Thread(nr, "Ayan");

		t1.start();
		t2.start();
		t3.start();
	}
}