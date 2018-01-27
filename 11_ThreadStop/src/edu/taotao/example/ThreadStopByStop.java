package edu.taotao.example;

/**
 * 通过stop方法来暴利停止线程
 * 
 *
 */
public class ThreadStopByStop extends Thread {

	private int i = 0;

	@Override
	public void run() {
		super.run();
		try {
			while (true) {
				i++;
				System.out.println("i = " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			ThreadStopByStop thread = new ThreadStopByStop();
			thread.start();
			// 如果这里不沉睡，则开启就结束了
			thread.sleep(16000);
			// 暴利停止
			thread.stop();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
