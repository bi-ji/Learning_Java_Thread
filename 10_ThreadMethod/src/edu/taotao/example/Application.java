package edu.taotao.example;

import org.junit.jupiter.api.Test;

/**
 * 测试线程的方法
 * 
 *
 */
public class Application {

	/**
	 * 获取当前线程的名字
	 */
	@Test
	public void testCurrentThreadMethod() {
		System.out.println(Thread.currentThread().getName());
	}

	@Test
	public void testMyThreadInstanceProcess() {
		MyThread myThread = new MyThread();
		// 只有调用start方法才是线程的正确开启方式
		myThread.start();
		// 调用run方法则是相当于函数调用
		// myThread.run();
	}

	@Test
	public void testMyThreadIsAliveMethod() {
		AliveThread mThread = new AliveThread();
		boolean beforeAlive = mThread.isAlive();
		System.out.println("before thread start() thread.isAlive() = " + beforeAlive);
		mThread.start();
		boolean afterAlive = mThread.isAlive();
		System.out.println("after thread start() thread.isAlive() = " + afterAlive);
	}

	@Test
	public void testAliveThreadIsAliveMethod() throws Exception {
		AliveThread thread = new AliveThread();
		boolean before = thread.isAlive();
		System.out.println("01 before thread start() thread.isAlive() = " + before);
		thread.start();
		boolean afterStart = thread.isAlive();
		System.out.println("02 after thread start() thread.isAlive() = " + afterStart);
		// 这里睡一秒钟，是指的main线程睡一秒钟，在这一秒里，thread已经执行完毕，并且结束了，所以这里的thread.isAlive 是false
		Thread.sleep(1000);
		System.out.println("03 Thread.currentThread().getName():" + Thread.currentThread().getName()
				+ " sleep 1000 s,the AliveThread isAlive is " + thread.isAlive());
		System.out.println("04 Thread.currentThread().getName():" + Thread.currentThread().getName() + " isAlive is "
				+ Thread.currentThread().isAlive());
		System.out.println("05 Alive thread is alive status is " + thread.isAlive());
	}
}
