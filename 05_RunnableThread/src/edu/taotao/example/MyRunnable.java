package edu.taotao.example;

// 实现了Runnable接口的线程，同Thread
public class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("运行中！");
	}

}
