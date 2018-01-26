package edu.taotao.example;

public class Application {

	// 模拟两个线程同时进行登录操作，这里就出现了线程不安全的问题，如果不在LoginServlet的doPost上加synchronized 返回结果：
	// username=b,password=bb
	// username=b,password=aa
	// 加上synchronized，返回结果
	// username=a,password=aa
	// username=b,password=bb
	public static void main(String[] args) {
		LoginThreadA threadA = new LoginThreadA();
		threadA.start();
		LoginThreadB threadB = new LoginThreadB();
		threadB.start();
	}

}
