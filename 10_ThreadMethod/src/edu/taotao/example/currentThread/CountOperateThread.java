package edu.taotao.example.currentThread;

public class CountOperateThread extends Thread {

	public CountOperateThread() {
		System.out.println("CountOperateThread----begin");
		System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
		System.out.println("this.getName()=" + this.getName());
		System.out.println("CountOperateThread-----end");
	}

	@Override
	public void run() {
		System.out.println("CountOperateThread run ---- begin");
		System.out.println("run() Thread.currentThread().getName()=" + Thread.currentThread().getName());
		System.out.println("run() this.getName()=" + this.getName());
		System.out.println("CountOperateThread run ---- end");
	}

}
