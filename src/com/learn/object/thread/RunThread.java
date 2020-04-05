package com.learn.object.thread;

public class RunThread implements Runnable {

	public int i = 0;
	public int sum = 0;
	
	public RunThread() {
	}

	@Override
	public void run() {
//		startSingle();
		
//		startMult();
		
		printSum("for");
		
	}
	
	// 简单打印
	public void startSingle() {
		System.out.println(Thread.currentThread().getName() + " is running...");
	}
	
	// 用for循环,查看交替效果
	public void startMult() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Name: " +  Thread.currentThread().getName());
		}
	}
	
	// 用多个线程执行一个任务
	public void printSum(String type) {
		if(type == "while") {
			sumByWhile();	
		} else if(type == "for") {
			sumByFor();	
		} else {
			// throw...
		}
	}
	
	// while
	public void sumByWhile() {
		while(i < 10) {
			sum += i;
			System.out.println("Name: " +  Thread.currentThread().getName() + ", Current i: " + i);
			i++;
		}
		System.out.println(Thread.currentThread().getName() + " sum: "+ sum);
	}
	
	// for
	public void sumByFor() {
		for(; i < 10; i++) {
			sum += i;
			System.out.println("Name: " +  Thread.currentThread().getName() + ", Current i: " + i);
		}
		System.out.println(Thread.currentThread().getName() + " sum: "+ sum);
	}

}
