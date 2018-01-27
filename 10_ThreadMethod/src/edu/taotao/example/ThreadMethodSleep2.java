package edu.taotao.example;

import java.time.Instant;

// 测试线程的睡眠方法，让当前SleepThread方法睡眠，而不是main线程
public class ThreadMethodSleep2 extends Thread {

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
		ThreadMethodSleep2 sleepThread = new ThreadMethodSleep2();
		System.out.println("begin = " + Instant.now().toEpochMilli());
		// 注意这里调用的是start方法，调用start方法则是，线程实例调用，所以这里会打印出线程名
		// 由于线程之间是异步执行的，所以首先打印的main中的begin和end，最后是sleepThread线程执行的
		sleepThread.start();
		System.out.println("end   = " + Instant.now().toEpochMilli());

	}

}
