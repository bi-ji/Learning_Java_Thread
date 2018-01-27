package edu.taotao.example.thread.unsafe;

/**
 * 方法内的变量为线程安全的
 *
 */
public class ThreadA extends Thread {

	private HasSelfPrivateNum numRef;

	public ThreadA(HasSelfPrivateNum numRef) {
		this.numRef = numRef;
	}

	@Override
	public void run() {
		numRef.addI("a");
	}

}
