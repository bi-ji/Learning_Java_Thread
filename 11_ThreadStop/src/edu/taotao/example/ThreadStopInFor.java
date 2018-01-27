package edu.taotao.example;

/*
 * 线程中包含for循环的停止
 */
public class ThreadStopInFor extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 500000; i++) {
			// 如果当前线程被中断
			if (this.interrupted()) {
				System.out.println("当前线程已经是中断状态了！我要退出了");
				break;
			}
			System.out.println("i = " + (i + 1));
		}
	}
	
	public static void main(String[] args) {
		try {
			ThreadStopInFor thread = new ThreadStopInFor();
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
