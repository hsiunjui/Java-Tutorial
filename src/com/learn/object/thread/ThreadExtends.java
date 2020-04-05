package com.learn.object.thread;
/**
 * �̳�Thread�ഴ���߳�
 * @author reyshaw
 * sleep(millseconds); ����ʱ��󲢲�������ִ��,���ǿ�����״̬,�ȴ�cpu������Դ
 * join(); ������ִ��,���Դ���,��ʾִ�ж��ٺ���󽻸������߳�ִ��(������û��ִ�����)
 */
public class ThreadExtends extends Thread {
	
	// ��дrun����
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
		System.out.println(getName() + " is running..."); // >=1000��������ӡ
	}
	
	// join
	public void testJoin() {
		for(int i = 0; i < 1000; i++) {
			System.out.println(getName() + "����ִ��, i:" + i);
		}
	}
}
