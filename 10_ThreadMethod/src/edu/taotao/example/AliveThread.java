package edu.taotao.example;

// 测试线程的isAlive方法
public class AliveThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("AliveThread run()");
	}

}
