package edu.taotao.example;

import org.junit.jupiter.api.Test;

/**
 * 判断线程的状态是不是停止的
 * this.interrupted()： 测试当前线程是否已经中断，当前线程指
 * 运行this.interrupted()方法的线程 this.isInterrupted():测试线程是否已经中断
 *
 */
public class ThreadMethodInterrupted extends Thread {

	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 500000; i++) {
			System.out.println("i = " + (i + 1));
		}
	}

	/**
	 * 测试线程的interrupted方法
	 */
	@Test
	public void testInterrupted() {
		try {
			ThreadMethodInterrupted thread = new ThreadMethodInterrupted();
			thread.start();
			Thread.sleep(1000);
			thread.interrupt();
			/**
			 *  从打印结果看，thread线程并没有停止，这也就证明了interrupted方法的解释
			 *  测试当前线程是否已经中断，这个“当前线程”指的是main线程，未曾中断过
			 */
			System.out.println("是否停止1？ = " + thread.interrupted());
			System.out.println("是否停止2？ = " + thread.interrupted());
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}
	
	/**
	 * 从返回结果看，1为true，2为false
	 * 这是因为interrupted方法用于测试当前线程是否已经中断，线程中断状态由该方法清除。
	 * 如果连续两次调用该方法，则第二次调用将会返回false（在第一次你调用已经清除了其中断状态（原先是中断的）
	 * 且第二次调用检验完中断状态前当前线程再次中断的情况例外）
	 */
	@Test
	public void testMainInterrupted() {
		// 中断当前线程
		Thread.currentThread().interrupt();
		// true
		System.out.println("是否停止1？ = " + Thread.interrupted());
		// false
		System.out.println("是否停止2？ = " + Thread.interrupted());
		System.out.println("end!");
		
	}
	
	/**
	 * this.interrupted()：测试当前线程是否是中断状态，执行后具有将状态标志清除为false的功能
	 * this.isInterrupted():测试线程Thread对象是否已经是中断状态，不清除状态标志
	 */
	@Test
	public void testThreadIsInterrupted() {
		try {
			ThreadMethodInterrupted thread = new ThreadMethodInterrupted();
			thread.start();
			Thread.sleep(1000);
			thread.interrupt();
			System.out.println("是否停止1？ = " + thread.isInterrupted());
			System.out.println("是否停止2？ = " + thread.isInterrupted());
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}
}

