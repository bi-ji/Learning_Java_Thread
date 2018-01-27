package edu.taotao.example;

/**
 * 通过stop方法来暴利停止线程 stop方法与ThreadDeathException
 *
 */
public class ThreadStopByStop2 extends Thread {

	private int i = 0;

	@Override
	public void run() {
		try {
			this.stop();
		} catch (ThreadDeath e) {
			System.out.println("进入了catch() 方法");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ThreadStopByStop2 thread = new ThreadStopByStop2();
		thread.start();
	}
}
