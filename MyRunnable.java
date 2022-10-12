package com.example;

public class MyRunnable implements Runnable {

	public void run() {
		try {
			for (int i = 0; i < 3; i++) {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}