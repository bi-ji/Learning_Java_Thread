package edu.taotao.example.thread.methodLockObject2;

public class ThreadB extends Thread {
	
	private MyObject object;
	
	public ThreadB(MyObject object) {
		this.object = object;
	}
	
	@Override
	public void run() {
		object.methodB();
	}

}
