package edu.taotao.example;

public class Application {

	public static void main(String[] args) {
		// 这里创建了一个线程
		MyThread thread = new MyThread();
		/**
		 *  线程的开启是start方法，并不是run方式，其实也是通过start方法间接的调用run方法
		 *  根据返回结果可以看出，多线程中代码的执行顺序或调用顺序不是固定不变的
		 *  线程只是进程的一个子任务，具体调用要根据CPU的时间来决定
		 */
		thread.start();
		System.out.println("运行结束！");
	}
}
