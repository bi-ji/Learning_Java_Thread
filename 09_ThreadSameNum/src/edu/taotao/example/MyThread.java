package edu.taotao.example;

public class MyThread extends Thread {
	
	private int i = 5;
	
	@Override
	public void run() {
		// 通过查看源码，可以发现println()方法在内部是采用了synchronized的，
		// 但是i--的操作实在进入println之前的操作，所以这里还是会产生线程不安全的问题
		System.out.println("i=" + (i--) +" threadName=" + Thread.currentThread().getName());
	}

}
