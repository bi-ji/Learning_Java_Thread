package edu.taotao.example;

import java.time.Instant;

/**
 * 
 * 测试yield方法
 *
 */
public class MyThread extends Thread {

	@Override
	public void run() {
		long beginTime = Instant.now().toEpochMilli();
		int count = 0;
		for (int i = 0; i < 50000000; i++) {
			// 注释下面这句时，CPU独占时间片处理改方法，不注释时，CPU让给其他资源导致速度变慢
			// Thread.yield();
			count = count + (i + 1);
		}
		long endTime = Instant.now().toEpochMilli();
		System.out.println("用时：" + (endTime - beginTime) + "毫秒");
	}

	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
	}
}
