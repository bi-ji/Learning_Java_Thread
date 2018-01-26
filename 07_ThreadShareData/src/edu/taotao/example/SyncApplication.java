package edu.taotao.example;

// 演示线程之间共享变量
public class SyncApplication {

	public static void main(String[] args) {
		MySyncThread myThread = new MySyncThread();
		// 这里创建了五个线程，可以同时处理count
		// 显示场景：五个售货员A,B,C,D,E.共享count商品,但是对count商品进行了加锁，
		// 每次只能有一个售货员进行售货，其余客人要等待该售货员售货完毕后再进行相应的行为
		// 即排队的形式访问临界区，这是是线程安全的，否则就称之为线程不安全
		Thread a = new Thread(myThread,"A");
		Thread b = new Thread(myThread,"B");
		Thread c = new Thread(myThread,"C");
		Thread d = new Thread(myThread,"D");
		Thread e = new Thread(myThread,"E");
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
	}

}
