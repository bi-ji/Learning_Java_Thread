package edu.taotao.example;

/*
 * 线程中包含for循环的停止
 */
public class ThreadStopInFor2 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 500000; i++) {
			// 如果当前线程被中断
			if (this.interrupted()) {
				// 这里并不会终止线程的运行，线程还是会继续运行
				System.out.println("当前线程已经是中断状态了！我要退出了");
				break;
			}
			System.out.println("i = " + (i + 1));
		}
		System.out.println("我被输出，如果此代码是for又继续运行，线程并未中断");
	}
	
	public static void main(String[] args) {
		try {
			ThreadStopInFor2 thread = new ThreadStopInFor2();
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
