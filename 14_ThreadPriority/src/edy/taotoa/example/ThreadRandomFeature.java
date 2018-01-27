package edy.taotoa.example;

/**
 * 
 * 线程的随机性，并不是优先级较高的总是先执行完
 */
public class ThreadRandomFeature {
	
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			ThreadPrioriy3 thread3 = new ThreadPrioriy3();
			thread3.setPriority(5);
			thread3.start();
			ThreadPrioriy4 thread4 = new ThreadPrioriy4();
			thread4.setPriority(6);
			thread4.start();
		}
		
	}

}
