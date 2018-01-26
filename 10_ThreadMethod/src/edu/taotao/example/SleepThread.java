package edu.taotao.example;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

// 线程的sleep方法
public class SleepThread extends Thread {

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
		SleepThread sleepThread = new SleepThread();
		System.out.println("begin = " + Instant.now().toEpochMilli());
		sleepThread.start();
		System.out.println("end   = " + Instant.now().toEpochMilli());
	}

}
