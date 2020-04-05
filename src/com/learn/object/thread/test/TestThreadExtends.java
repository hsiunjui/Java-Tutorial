package com.learn.object.thread.test;

import com.learn.object.thread.ThreadExtends;

/**
 * һ���߳�ֻ������һ��
 * @author reyshaw
 *
 */
public class TestThreadExtends {

	public static void main(String[] args) {
		// ����������ʾ��
//		testStart();
		
		// join
		testJoin();

	}

	// start and sleep
	public static void testStart() {
		Thread th = new ThreadExtends();
		th.start(); // ����
		// th.start(); // IllegalThreadStateException
	}
	
	// join
	public static void testJoin() {
		Thread th = new ThreadExtends();
		th.start(); // ����
		try {
			th.join(); // ��������ռ��Դ
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		// ���»����߳̽�����ִ��
		for(int j = 0; j < 2000; j++) {
			System.out.println("���߳�ִ����, j: " + j);
		}
		System.out.println("���߳�ִ�н���");
	}
	
}
