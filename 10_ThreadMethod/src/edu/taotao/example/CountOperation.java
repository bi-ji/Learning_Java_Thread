package edu.taotao.example;

/**
 * 测试Thread.currentThread() 和 this的差异 
 *
 */
public class CountOperation extends Thread {

	
	public CountOperation() {
		System.out.println("CountOperate --- begin");
		System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
		System.out.println("Thread.currentThread().isAlive() = " + Thread.currentThread().isAlive());
		System.out.println("this.getName() = " + this.getName());
		System.out.println("this.isAlive() = " + this.isAlive());
		System.out.println("CountOperate --- end");
	}
	
	@Override
	public void run() {
		System.out.println("run --- begin");
		System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
		System.out.println("Thread.currentThread().isAlive() = " + Thread.currentThread().isAlive());
		System.out.println("this.getName() = " + this.getName());
		System.out.println("this.isAlive() = " + this.isAlive());
		System.out.println("CountOperate --- end");
	}
	
	public static void main(String[] args) {
		CountOperation co = new CountOperation();
		Thread thread = new Thread(co);
		System.out.println("main begin thread isAlive = " + thread.isAlive());
		// 这里只是相当于更改了main线程的名称
		thread.setName("A");
		thread.start();
		System.out.println("main end thread isAlive = " + thread.isAlive());
	}
}
