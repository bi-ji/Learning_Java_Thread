package edu.taotao.example;

import java.time.Instant;

/**
 * 
 * 使用return停止线程
 * 不过还是建议使用“抛异常”的方法来实现线程的停止，因为在catch块中还可以将异常向上抛，
 * 使线程停止的事件得以传播
 *
 */
public class ThreadStopByReturn extends Thread {

	@Override
	public void run() {
		while (true) {
			if (this.isInterrupted()) {
				System.out.println("停止了！");
				return;
			}
			System.out.println("timer = " + Instant.now().toEpochMilli());
		}
	}

	public static void main(String[] args) throws Exception {
		ThreadStopByReturn thread = new ThreadStopByReturn();
		thread.start();
		Thread.sleep(2000);
		thread.interrupt();
	}
}
