package edu.taotao.example.thread.unsafe;

/**
 * 本示例是两个线程同时访问一个没有同步的方法，如果两个线程同时操作业务对象中的实例变量 则有可能会出现"非线程安全"问题
 *
 *
 */
public class Application {

	public static void main(String[] args) {
		// 这里是一个对象，两个线程访问，所以应该是顺序访问的，一个线程拿到锁，执行，释放锁，另一个同样的
		HasSelfPrivateNum numRef = new HasSelfPrivateNum();
		ThreadA threadA = new ThreadA(numRef);
		threadA.start();
		ThreadB threadB = new ThreadB(numRef);
		threadB.start();
	}

}
