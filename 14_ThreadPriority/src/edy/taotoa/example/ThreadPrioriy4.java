package edy.taotoa.example;

import java.time.Instant;
import java.util.Random;

/**
 * 
 * 优先级的线程
 *
 */
public class ThreadPrioriy4 extends Thread {

	@Override
	public void run() {
		long beginTime = Instant.now().toEpochMilli();
		for (int i = 0; i < 1000; i++) {
			Random random = new Random();
			random.nextInt();
		}
		long endTime = Instant.now().toEpochMilli();
		System.out.println(" ------- thread 2 use time = " + (endTime - beginTime));
	}

}
