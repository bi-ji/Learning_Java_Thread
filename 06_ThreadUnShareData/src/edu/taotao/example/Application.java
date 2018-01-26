package edu.taotao.example;

// 测试线程的线程变量是不会与其他线程共享的
public class Application {

	public static void main(String[] args) {
		// 现实场景：A、B、C三个销售员，每个销售员都有自己的产品count5份
		// 线程A有自己的线程变量count
		MyThread threadA = new MyThread("A");
		// 线程B有自己的线程变量count
		MyThread threadB = new MyThread("B");
		// 线程C有自己的线程变量count
		MyThread threadC = new MyThread("C");
		threadA.start();
		threadB.start();
		threadC.start();
	}

}
