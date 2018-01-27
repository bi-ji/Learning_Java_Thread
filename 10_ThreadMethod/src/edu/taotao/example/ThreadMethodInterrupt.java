package edu.taotao.example;

/**
 * 使用interrupt方法来停止线程，但interrupt方法并不像for+break语句一样，能够马上停止
 * 调用interrupt方法仅仅是在当前线程中打了一个停止的标记，并不是真正的停止线程
 *
 */
public class ThreadMethodInterrupt extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 500000; i++) {
			System.out.println("i = " + (i + 1));
		}
	}

	public static void main(String[] args) {
		try {
			ThreadMethodInterrupt thread = new ThreadMethodInterrupt();
			thread.start();
			Thread.sleep(2000);
			thread.interrupt();
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
	}
}
