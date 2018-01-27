package edu.taotao.example;

/**
 * 
 * 同步对象
 * suspend 与resume的缺点 : 独占
 *
 */
public class SynchronizedObject {

	synchronized public void printString() {
		System.out.println("begin");
		if (Thread.currentThread().getName().equals("a")) {
			System.out.println("a 线程永远suspend了");
			Thread.currentThread().suspend();
		}
		System.out.println("end");
	}

	public static void main(String[] args) throws Exception {
		// 在使用suspend与resume方法时，如果使用不当，
		// 极易造成公共的同步对象独占，使得其他线程无法访问公共同步对象
		final SynchronizedObject object = new SynchronizedObject();
		Thread thread = new Thread() {
			@Override
			public void run() {
				object.printString();
			}
		};
		thread.setName("a");
		thread.start();
		Thread.sleep(1000);
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				System.out.println("thread2 启动了，但进入不了printString（）方法！只打印一个begin");
				System.out.println("因为printString()方法被a线程锁定，并且永远suspend暂停了");
				object.printString();
			}
		};
		thread2.start();
	}
}
