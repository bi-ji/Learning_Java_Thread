package edu.taotao.example;

// 创建一个线程
public class MyThread extends Thread {

	// 线程数据
	private int count = 5;

	@Override
	public void run() {
		super.run();
		// 这里不要使用for语句，因为使用同步后其他线程就得不到运行的机会了，一直由一个线程进行减法运算
		count--;
		System.out.println("由 " + this.currentThread().getName() + " 计算，count=" + count);
	}
}
