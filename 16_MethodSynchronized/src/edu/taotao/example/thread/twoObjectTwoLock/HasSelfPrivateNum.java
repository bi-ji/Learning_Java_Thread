package edu.taotao.example.thread.twoObjectTwoLock;

/**
 * 测试方法内变量为线程安全
 *
 */
public class HasSelfPrivateNum {

	private int num = 0;

	/*
	 * 加上synchronized 则不会出现线程不安全的问题，加把锁再说，改成顺序流
	 * 说明此方法应该被顺序调用
	 */
	synchronized public void addI(String username) {
		try {
			if (username.equals("a")) {
				num = 100;
				System.out.println("a set over");
				Thread.sleep(2000);
			} else {
				num = 200;
				System.out.println("b set over");
			}
			System.out.println(username + " num = " + num);
		} catch (InterruptedException e) {
		}
	}

}
