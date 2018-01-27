package edu.taotao.example.thread.twoObjectTwoLock;

public class Application {

	public static void main(String[] args) {
		// 这里是两个实例对象，两把锁，不同的线程访问并没有先后，所以是异步的，打印结果有可能交叉打印
		HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
		HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();
		ThreadA threadA = new ThreadA(numRef1);
		threadA.start();
		ThreadB threadB = new ThreadB(numRef2);
		threadB.start();

	}

}
