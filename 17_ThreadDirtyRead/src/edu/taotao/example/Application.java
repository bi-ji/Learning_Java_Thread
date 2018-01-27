package edu.taotao.example;

/**
 * 测试脏读
 * @author Administrator
 *
 */
public class Application {
	
	public static void main(String[] args) throws Exception {
		PublicVar var = new PublicVar();
		ThreadA threadA = new ThreadA(var);
		threadA.setName("A");
		threadA.start();
		Thread.sleep(50);
		var.getValue();
		ThreadB threadB = new ThreadB(var);
		threadB.setName("B");
		threadB.start();
	}

}
