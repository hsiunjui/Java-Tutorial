package com.learn.object.thread;
/**
 * ������
 * @author reyshaw
 * Ϊ�˷���,����û��ʹ��get/set����
 * synchronized���εķ������߿�,�����������̲߳����
 */
public class Bank {
	private int balance = 100; // 
	
	// ��ȡ���
	public int getBalance() {
		return balance;
	}
	// ��
	public void save() {
		balance += 10; // ����ִ����һ���,�����������߳�ִ����
		System.out.println("balance after saved: " + getBalance());
	}
	// ȡ
	public void draw() {
		balance -= 10;
		System.out.println("balance after draw: " + getBalance());
	}
	
	// ͬ����
	public synchronized void synchronizedSave() {
		this.save();
	}
	
	// ͬ��ȡ
	public  void synchronizedDraw() {
		synchronized(this) { // ֻ�����ֲ�ͬ�ı�ʾ��ʽ
			balance -= 10;
			System.out.println("balance after draw: " + getBalance());
		}
	}
}
