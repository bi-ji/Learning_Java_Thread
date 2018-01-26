package edu.taotao.example;

// 创建一个线程，输出创建线程的id
public class MyThread extends Thread {

	private int i;

	public MyThread(int i) {
		this.i = i;
	}

	@Override
	public void run() {
		super.run();
		System.out.println("MyThread:" + i);
	}

}
