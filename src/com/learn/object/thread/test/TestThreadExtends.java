package com.learn.object.thread.test;

import com.learn.object.thread.ThreadExtends;

/**
 * 一个线程只能启动一次
 * @author reyshaw
 *
 */
public class TestThreadExtends {

	public static void main(String[] args) {
		// 创建并启动示例
//		testStart();
		
		// join
		testJoin();

	}

	// start and sleep
	public static void testStart() {
		Thread th = new ThreadExtends();
		th.start(); // 启动
		// th.start(); // IllegalThreadStateException
	}
	
	// join
	public static void testJoin() {
		Thread th = new ThreadExtends();
		th.start(); // 启动
		try {
			th.join(); // 会优先抢占资源
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		// 以下会在线程结束后执行
		for(int j = 0; j < 2000; j++) {
			System.out.println("主线程执行中, j: " + j);
		}
		System.out.println("主线程执行结束");
	}
	
}
