package edu.taotao.example.thread.safe;

/**
 * 测试方法内变量为线程安全
 *
 */
public class HasSelfPrivateNum {

	public void addI(String username) {
		try {
			int num = 0;
			if (username.equals("a")) {
				num = 100;
				System.out.println("a set over");
				Thread.sleep(2000);
			} else {
				num = 200;
				System.out.println("b set over");
			}
			System.out.println(username + " num = " + num);
		} catch (InterruptedException e) {
		}
	}

}
