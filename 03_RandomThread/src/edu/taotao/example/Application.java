package edu.taotao.example;

public class Application {

	// 线程的启动主要是依靠CPU来执行
	public static void main(String[] args) {
		try {
			MyThread myThread = new MyThread();
			myThread.setName("myThread");
			// 通知"线程规划器"，此线程已经准备就绪，等待调用线程对象的run方法，也就是使线程得到运行，
			// 启动线程，具有异步执行的效果，如果调用thread.run()就不是异步执行的。
			// 执行start()方法并不代表线程的启动顺序
			myThread.start();
			for (int i = 0; i < 10; i++) {
				int time = (int) (Math.random() * 1000);
				Thread.sleep(time);
				System.out.println("main=" + Thread.currentThread().getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
