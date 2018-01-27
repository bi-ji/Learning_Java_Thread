package edu.taotao.example;

// 获取线程的id,唯一标识
public class ThreadMethodGetId {

	public static void main(String[] args) {
		Thread currentThread = Thread.currentThread();
		System.out.println("Thread.name = " + currentThread.getName() + ",Thread.getId() " + currentThread.getId());
		ThreadMethodSleep sleepThread = new ThreadMethodSleep();
		System.out.println("Thread.name = " + sleepThread.getName() + ",Thread.getId() " + sleepThread.getId());
		
	}

}
