package edu.taotao.example;

// 创建一个线程，其拥有自己的线程变量，不共享给其他线程
public class MyThread extends Thread {

	private int count = 5;

	// 设置线程的名字
	public MyThread(String name) {
		this.setName(name);
	}

	@Override
	public void run() {
		super.run();
		while (count > 0) {
			count--;
			System.out.println("由 " + this.currentThread().getName() + "计算,count=" + count);
		}

	}
}
