package edu.taotao.example.thread.methodLockObject2;

import java.time.Instant;

public class MyObject {

	synchronized public void methodA() {
		try {
			System.out.println("begin methodA threadName = " + Thread.currentThread().getName());
			Thread.sleep(5000);
			System.out.println("end");
		} catch (InterruptedException e) {
		}
	}
	
	synchronized public void methodB() {
		try {
			System.out.println("begin methodB threadName = " + Thread.currentThread().getName() + " begin time = " + Instant.now().toEpochMilli());
			Thread.sleep(5000);
			System.out.println("end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
