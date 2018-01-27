package edu.taotao.example;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

// 线程的sleep方法，这个例子是让main线程谁秒了2秒，而不是sleepThread
public class ThreadMethodSleep extends Thread {

	@Override
	public void run() {
		try {
			System.out.println("run threadName = " + this.currentThread().getName() + " begin");
			Thread.sleep(2000);
			System.out.println("run threadName = " + this.currentThread().getName() + " end");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ThreadMethodSleep sleepThread = new ThreadMethodSleep();
		System.out.println("begin = " + Instant.now().toEpochMilli());
		// 这里是将main线程睡眠了2秒,注意这里调用的是run方法，之前说过，调用run只相当于方法调用，
		// 所以这里其实是main线程在调用
		sleepThread.run();
		System.out.println("end   = " + Instant.now().toEpochMilli());
	}

}
