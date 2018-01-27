package edu.taotao.example;

/**
 * 通过线程停止异常
 * @see ThreadStopInFor
 * @see ThreadStopInFor2
 *
 */
public class ThreadStopByException  extends Thread{

	@Override
	public void run() {
		super.run();
		try {
			for (int i = 0; i < 500000; i++) {
				// 如果当前线程被中断
				if (this.interrupted()) {
					// 这里并不会终止线程的运行，线程还是会继续运行
					System.out.println("当前线程已经是中断状态了！我要退出了");
					throw new InterruptedException("通过抛异常来强行停止线程");
				}
				System.out.println("i = " + (i + 1));
			}
			System.out.println("我被输出，如果此代码是for又继续运行，线程并未中断");
		} catch (InterruptedException e) {
			System.out.println("ThreadStopByException run catch Exception");
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			ThreadStopByException thread = new ThreadStopByException();
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
