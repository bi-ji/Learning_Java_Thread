package edu.taotao.example;

// 创建一个线程
public class MySyncThread extends Thread {

	// 线程数据
	private int count = 5;

	// synchronized 表示对该方法进行加锁，使之处于临界区，这样这个函数的方法就只能排队同步访问，而不能异步同时访问。
	@Override
	synchronized public void run() {
		super.run();
		// 这里不要使用for语句，因为使用同步后其他线程就得不到运行的机会了，一直由一个线程进行减法运算
		count--;
		System.out.println("由 " + this.currentThread().getName() + " 计算，count=" + count);
	}
}
