package edu.taotao.example.thread.twoObjectTwoLock;

public class ThreadA  extends Thread{
	
	private HasSelfPrivateNum numRef;
	
	public ThreadA(HasSelfPrivateNum numRef) {
		this.numRef = numRef;
	}
	
	@Override
	public void run() {
		super.run();
		numRef.addI("a");
	}

}
