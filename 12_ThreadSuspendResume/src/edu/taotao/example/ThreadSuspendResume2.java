package edu.taotao.example;

/**
 * suspend resume的独占锁
 * 
 *
 */
public class ThreadSuspendResume2 extends Thread {

	private long i = 0;

	@Override
	public void run() {
		while (true) {
			// 这里如果这样写，则会显示main end，如果采用print(i),则由于print函数是同步的，
			// 则会一直持有i的锁，不会释放，则不会打印出main end!
			i++;
			System.out.println(i);
		}
	}

	public static void main(String[] args) throws Exception{
		ThreadSuspendResume2 thread = new ThreadSuspendResume2();
		thread.start();
		Thread.sleep(1000);
		thread.suspend();
		System.out.println("main end!");
	}
}
