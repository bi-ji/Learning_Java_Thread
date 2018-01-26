package edu.taotao.example;

// 演示线程之间共享变量
public class Application {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		// 这里创建了五个线程，可以同时处理count
		// 显示场景：五个售货员A,B,C,D,E.共享count商品
		Thread a = new Thread(myThread,"A");
		Thread b = new Thread(myThread,"B");
		Thread c = new Thread(myThread,"C");
		Thread d = new Thread(myThread,"D");
		Thread e = new Thread(myThread,"E");
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
	}

}
