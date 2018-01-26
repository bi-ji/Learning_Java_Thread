package edu.taotao.example;

// 实现了Runnable接口的线程实现，运行结果同02_CreateThread
public class Application {

	public static void main(String[] args) {
		// 创建一个实现了Runnable接口的实体对象
		MyRunnable runnable = new MyRunnable();
		// 将改对象当作线程的构造函数的参数传入给线程，创建线程对象
		Thread thread = new Thread(runnable);
		thread.start();
		System.out.println("运行结束");
	}
}
