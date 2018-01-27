package edu.taotao.example;

public class ThreadB extends Thread{
	
	private PublicVar var;

	public ThreadB(PublicVar var) {
		this.var = var;
	}
	
	
	@Override
	public void run() {
		var.setValue("b", "bbb");
	}
}
