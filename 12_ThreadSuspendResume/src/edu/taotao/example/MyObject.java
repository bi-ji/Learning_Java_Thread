package edu.taotao.example;

/**
 * suspend与resume方法的缺点 —— 不同步
 * 
 *
 */
public class MyObject {

	private String username = "1";
	private String password = "11";

	public void setValue(String u, String p) {
		this.username = u;
		if (Thread.currentThread().getName().equals("a")) {
			System.out.println("停止a线程！");
			Thread.currentThread().suspend();
		}
		this.password = p;
	}

	public void printUsernameAndPassword() {
		System.out.println(username + " " + password);
	}
	
	public static void main(String[] args) throws Exception {
		final MyObject object = new MyObject();
		Thread thread = new Thread() {
			@Override
			public void run() {
				object.setValue("a", "aa");
			}
		};
		thread.setName("a");
		thread.start();
		Thread.sleep(500);
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				object.printUsernameAndPassword();
			}
		};
		thread2.start();
	}
}
