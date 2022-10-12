package com.example;

public class ThreadTest extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread() + "" + i);
		}
	}

	public static void main(String[] args) {

		ThreadTest t = new ThreadTest();
		ThreadTest t1 = new ThreadTest();
		ThreadTest t2 = new ThreadTest();
		t.start();
		t1.run();
		t2.start();
	}
}