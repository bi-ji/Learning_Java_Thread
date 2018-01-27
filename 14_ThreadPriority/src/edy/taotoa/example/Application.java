package edy.taotoa.example;

public class Application {
	
	public static void main(String[] args) {
		System.out.println("main thread begin priority = " + Thread.currentThread().getPriority());
		// 设置线程优先级,若不注释，则下面线程的优先级同6，若注释，则下面的优先级等于main的优先级
//		Thread.currentThread().setPriority(6);
		System.out.println("main thread end priority = " + Thread.currentThread().getPriority());
		MyThread1 thread1 = new MyThread1();
		thread1.start();
		
	}

}
