package edu.taotao.example.thread.methodLockObject2;

public class Application {

	public static void main(String[] args) {
		// 这里是同步还是异步的方式取决于 MyObject#methodA()是否添加了synchronized
		MyObject object = new MyObject();
		ThreadA threadA = new ThreadA(object);
		threadA.setName("A");
		threadA.start();
		ThreadB threadB = new ThreadB(object);
		threadB.setName("B");
		threadB.start();

	}

}
