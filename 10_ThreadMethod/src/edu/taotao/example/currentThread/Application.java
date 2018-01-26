package edu.taotao.example.currentThread;

public class Application {
	
	public static void main(String[] args) {
		CountOperateThread thread = new CountOperateThread();
		Thread t = new Thread(thread);
		t.setName("A");
		t.start();
	}
}
