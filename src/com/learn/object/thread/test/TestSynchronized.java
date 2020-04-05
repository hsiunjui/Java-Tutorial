package com.learn.object.thread.test;

import com.learn.object.thread.Bank;
import com.learn.object.thread.DrawThread;
import com.learn.object.thread.SaveThread;

public class TestSynchronized {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		
		// ���߳�ִ��,û������
		//		bank.save(); // 110
		//		bank.draw(); // 100
		
		SaveThread st = new SaveThread(bank);
		DrawThread dt = new DrawThread(bank);
		
		st.start(); // ��ʼ�� ���û��ͬ��,100,110,90���п���
		try {
			st.join();  // �ȴ���ȡ,��������������ʱ��ȡ���, join��Ҫ�����ڵ�ǰ�߳�start����,�����߳�startǰ��
//			dt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		dt.start(); // ��ʼȡ
		

	}

}
