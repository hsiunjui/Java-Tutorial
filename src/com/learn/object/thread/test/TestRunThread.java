package com.learn.object.thread.test;

import com.learn.object.thread.RunThread;
/**
 * 
 * @author reyshaw
 *
 */
public class TestRunThread {

	public static void main(String[] args) {

//		startSingle("first"); // 启动一个线程
		
//		startMult(); // 启动多个线程
		
		printSum(); // 多个线程执行一个任务
		
	}
	
	// 创建并启动线程
	public static void startSingle(String name) {
		RunThread rt = new RunThread(); // 创建实现类的实例
		Thread thread = new Thread(rt); // 创建Thread类并把实例类作为参数
		thread.start(); // 启动线程
	}
	
	// 创建并启动多个线程
	public static void startMult() { // 两个会交替或者一先一后
		startSingle("first");
		startSingle("second");
	}
	
	// 启动多个线程执行一个任务(会与预期有所不同)
	public static void printSum() {
		RunThread rt = new RunThread();
		Thread t1 = new Thread(rt);
		Thread t2 = new Thread(rt);
		t1.start();
		t2.start();
		
	}

}
