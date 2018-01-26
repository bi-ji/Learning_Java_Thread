package edu.taotao.example;

// 登录线程
public class LoginThreadB extends Thread {

	@Override
	public void run() {
		LoginServlet.doPost("b", "bb");
	}
}
