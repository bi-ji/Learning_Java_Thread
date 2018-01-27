package edu.taotao.example;

public class ThreadA extends Thread{
	
	private PublicVar var;

	public ThreadA(PublicVar var) {
		this.var = var;
	}
	
	
	@Override
	public void run() {
		var.setValue("a", "aaa");
	}
}
