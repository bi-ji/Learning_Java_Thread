package edy.taotoa.example;

/**
 * 
 * 测试线程优先级
 *
 */
public class ThreadPriorityApplication {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			ThreadPrioriy1 thread1 = new ThreadPrioriy1();
			thread1.setPriority(1);
			thread1.start();
			ThreadPrioriy2 thread2 = new ThreadPrioriy2();
			thread2.setPriority(10);
			thread2.start();
		}
	}

}
