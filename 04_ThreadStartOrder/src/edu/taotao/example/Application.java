package edu.taotao.example;

/**
 * 由程序的运行结果可知，线程的运行完全和代码顺序无关，和当前CPU的空闲有关
 * 线程并不会按照预定的代码顺序运行
 *
 */
public class Application {

	public static void main(String[] args) {
		MyThread thread01 = new MyThread(1);
		MyThread thread02 = new MyThread(2);
		MyThread thread03 = new MyThread(3);
		MyThread thread04 = new MyThread(4);
		MyThread thread05 = new MyThread(5);
		MyThread thread06 = new MyThread(6);
		MyThread thread07 = new MyThread(7);
		MyThread thread08 = new MyThread(8);
		MyThread thread09 = new MyThread(9);
		MyThread thread10 = new MyThread(10);
		MyThread thread11 = new MyThread(11);
		MyThread thread12 = new MyThread(12);
		MyThread thread13 = new MyThread(13);
		MyThread thread14 = new MyThread(14);
		MyThread thread15 = new MyThread(15);
		thread01.start();
		thread02.start();
		thread03.start();
		thread04.start();
		thread05.start();
		thread06.start();
		thread07.start();
		thread08.start();
		thread09.start();
		thread10.start();
		thread11.start();
		thread12.start();
		thread13.start();
		thread14.start();
		thread15.start();
	}

}
