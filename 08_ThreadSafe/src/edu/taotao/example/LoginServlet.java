package edu.taotao.example;

// 本类模拟一个Servlet组件
public class LoginServlet {

	private static String usernameRef;

	private static String passwordRef;

	// 加上synchronized，阻止线程不安全的事情出现
	synchronized public static void doPost(String username, String password) {
		try {
			usernameRef = username;
			if (username.equals("a")) {
				Thread.sleep(5000);
			}
			passwordRef = password;
			System.out.println("username=" + usernameRef + ",password=" + passwordRef);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
