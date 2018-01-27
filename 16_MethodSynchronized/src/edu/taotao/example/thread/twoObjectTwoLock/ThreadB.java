package edu.taotao.example.thread.twoObjectTwoLock;

public class ThreadB  extends Thread{
	
	private HasSelfPrivateNum numRef;
	
	public ThreadB(HasSelfPrivateNum numRef) {
		this.numRef = numRef;
	}
	
	@Override
	public void run() {
		super.run();
		numRef.addI("b");
	}

}
