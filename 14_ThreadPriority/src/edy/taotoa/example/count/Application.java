package edy.taotoa.example.count;

public class Application {

	public static void main(String[] args) throws Exception {

		ThreadA a = new ThreadA();
		a.setPriority(Thread.NORM_PRIORITY - 3);
		a.start();
		ThreadB b = new ThreadB();
		b.setPriority(Thread.NORM_PRIORITY  + 3);
		b.start();
		Thread.sleep(2000);
		a.stop();
		b.stop();
		System.out.println("a = " + a.getCount()); 
		System.out.println("b = " + b.getCount()); 
	}

}
