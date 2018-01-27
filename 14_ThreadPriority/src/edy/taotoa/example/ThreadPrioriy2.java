package edy.taotoa.example;

import java.time.Instant;
import java.util.Random;

/**
 * 
 * 优先级的线程
 *
 */
public class ThreadPrioriy2 extends Thread {

	@Override
	public void run() {
		long beginTime = Instant.now().toEpochMilli();
		long addResult = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 50000; j++) {
				Random random = new Random();
				random.nextInt();
				addResult = addResult + i;
			}
		}
		long endTime = Instant.now().toEpochMilli();
		System.out.println(" ******* thread 1 use time = " + (endTime - beginTime));
	}

}
