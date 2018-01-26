package edu.taotao.example;

/**
 * 自定义线程
 *
 */
public class MyThread extends Thread {

	@Override
	public void run() {
		super.run();
		System.out.println("MyThread");
	}

}
