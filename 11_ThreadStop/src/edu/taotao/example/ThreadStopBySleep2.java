package edu.taotao.example;

/**
 * 通过线程沉睡来停止异常 先interrupt，再sleep
 * 
 * @see ThreadStopInFor
 * @see ThreadStopInFor2
 *
 */
public class ThreadStopBySleep2 extends Thread {

	@Override
	public void run() {
		super.run();
		try {
			for (int i = 0; i < 100000; i++) {
				System.out.println("i = " + (i + 1));
			}
			System.out.println("run begin");
			Thread.sleep(200000);
			System.out.println("run end");
		} catch (InterruptedException e) {
			System.out.println("先停止，再遇到了sleep，进去catch");
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		ThreadStopBySleep2 thread = new ThreadStopBySleep2();
		thread.start();
		thread.interrupt();
		System.out.println("end!");
	}
}
