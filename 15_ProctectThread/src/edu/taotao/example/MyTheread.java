package edu.taotao.example;

public class MyTheread extends Thread {

	private int i = 0;

	@Override
	public void run() {
		try {
			while (true) {
				i++;
				System.out.println("i = " + i);
				Thread.sleep(1000);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception{
		MyTheread thread = new MyTheread();
		// 设置守护进程
		thread.setDaemon(true);
		thread.start();
		Thread.sleep(5000);
		System.out.println("我离开thread对象也不再打印了，就是停止了！");
		
	}
	
}
