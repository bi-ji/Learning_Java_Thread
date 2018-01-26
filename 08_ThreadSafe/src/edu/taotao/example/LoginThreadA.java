package edu.taotao.example;

// 登录线程
public class LoginThreadA extends Thread {

	@Override
	public void run() {
		LoginServlet.doPost("a", "aa");
	}
}
