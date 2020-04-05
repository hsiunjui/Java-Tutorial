package com.learn.object.thread;
/**
 * 继承Thread类创建线程
 * @author reyshaw
 * sleep(millseconds); 到达时间后并不会马上执行,而是可运行状态,等待cpu分配资源
 * join(); 会优先执行,可以传参,表示执行多少毫秒后交给其他线程执行(不管有没有执行完毕)
 */
public class ThreadExtends extends Thread {
	
	// 重写run方法
	public void run() {
		// testStart();
		
		//	 testSleep();
		
		testJoin();
	}
	
	// start
	public void testStart() {
		System.out.println("Thread started..");
	}
	
	// sleep
	public void testSleep() {
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(getName() + " is running..."); // >=1000后毫秒后会打印
	}
	
	// join
	public void testJoin() {
		for(int i = 0; i < 1000; i++) {
			System.out.println(getName() + "正在执行, i:" + i);
		}
	}
}
