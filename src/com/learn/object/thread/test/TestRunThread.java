package com.learn.object.thread.test;

import com.learn.object.thread.RunThread;
/**
 * 
 * @author reyshaw
 *
 */
public class TestRunThread {

	public static void main(String[] args) {

//		startSingle("first"); // ����һ���߳�
		
//		startMult(); // ��������߳�
		
		printSum(); // ����߳�ִ��һ������
		
	}
	
	// �����������߳�
	public static void startSingle(String name) {
		RunThread rt = new RunThread(); // ����ʵ�����ʵ��
		Thread thread = new Thread(rt); // ����Thread�ಢ��ʵ������Ϊ����
		thread.start(); // �����߳�
	}
	
	// ��������������߳�
	public static void startMult() { // �����ύ�����һ��һ��
		startSingle("first");
		startSingle("second");
	}
	
	// ��������߳�ִ��һ������(����Ԥ��������ͬ)
	public static void printSum() {
		RunThread rt = new RunThread();
		Thread t1 = new Thread(rt);
		Thread t2 = new Thread(rt);
		t1.start();
		t2.start();
		
	}

}
