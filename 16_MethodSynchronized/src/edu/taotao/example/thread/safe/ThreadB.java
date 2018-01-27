package edu.taotao.example.thread.safe;

/**
 * 方法内的变量为线程安全的
 *
 */
public class ThreadB extends Thread {

	private HasSelfPrivateNum numRef;

	public ThreadB(HasSelfPrivateNum numRef) {
		this.numRef = numRef;
	}

	@Override
	public void run() {
		numRef.addI("b");
	}

}
