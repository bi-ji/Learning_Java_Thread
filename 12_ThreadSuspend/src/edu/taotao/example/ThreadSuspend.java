package edu.taotao.example;

import java.time.Instant;

/**
 * suspend暂停线程
 *
 */
public class ThreadSuspend extends Thread {

	private long i = 0;

	public long getI() {
		return i;
	}

	public void setI(long i) {
		this.i = i;
	}

	@Override
	public void run() {
		while (true) {
			i++;
		}
	}

	public static void main(String[] args) throws Exception {
		ThreadSuspend thread = new ThreadSuspend();
		thread.start();
		Thread.sleep(5000);
		// A段 暂停
		thread.suspend();
		System.out.println("A = " + Instant.now().toEpochMilli() + " i= " + thread.getI());
		Thread.sleep(5000);
		System.out.println("A = " + Instant.now().toEpochMilli() + " i= " + thread.getI());
		// B段
		thread.resume();
		Thread.sleep(5000);
		// C段
		thread.suspend();
		System.out.println("B = " + Instant.now().toEpochMilli() + " i= " + thread.getI());
		Thread.sleep(5000);
		System.out.println("B = " + Instant.now().toEpochMilli() + " i= " + thread.getI());
		
	}
}
