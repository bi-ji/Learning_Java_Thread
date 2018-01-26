package edu.taotao.example;

// 自定义线程
public class MyThread extends Thread {

	public MyThread() {
		System.out.println("MyThread 线程的构造方法：" + Thread.currentThread().getName());
	}

	@Override
	public void run() {
		System.out.println("MyThread 线程的run方法：" + Thread.currentThread().getName());
	}
}
