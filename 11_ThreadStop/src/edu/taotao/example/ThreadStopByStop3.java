package edu.taotao.example;

/**
 * 通过stop方式释放锁将会给数据造成不一致性的后果，
 * 如果出现这种情况，程序处理的数据就有可能遭到破坏。
 * 下面演示一下
 * 
 * @see SynchronizedObject
 */
public class ThreadStopByStop3 extends Thread {

	private SynchronizedObject object;

	public ThreadStopByStop3(SynchronizedObject object) {
		super();
		this.object = object;
	}

	@Override
	public void run() {
		object.printString("b", "bb");
	}

	public static void main(String[] args) {
		try {
			SynchronizedObject obj = new SynchronizedObject();
			ThreadStopByStop3 thread = new ThreadStopByStop3(obj);
			thread.start();
			// 这里时间没给够，如果给够100000毫秒，则应该结果是正确的
			Thread.sleep(5000);
			thread.stop();
			System.out.println(obj.getUsername() + "," + obj.getPassword());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
