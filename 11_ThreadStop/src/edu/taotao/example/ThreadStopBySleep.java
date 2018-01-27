package edu.taotao.example;

/**
 * 通过线程沉睡来停止异常 先sleep，再interrupt
 * 
 * @see ThreadStopInFor
 * @see ThreadStopInFor2
 *
 */
public class ThreadStopBySleep extends Thread {

	@Override
	public void run() {
		super.run();
		try {
			System.out.println("run begin");
			Thread.sleep(200000);
			System.out.println("run end");
		} catch (InterruptedException e) {
			System.out.println("通过沉睡来停止线程" + this.isInterrupted());
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		try {
			ThreadStopBySleep thread = new ThreadStopBySleep();
			thread.start();
			Thread.sleep(2000);
			thread.interrupt();
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}
}
