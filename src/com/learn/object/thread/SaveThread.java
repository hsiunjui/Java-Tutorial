package com.learn.object.thread;

/**
 * ����߳�
 * @author reyshaw
 *
 */
public class SaveThread extends Thread {
	private Bank bank;
	
	public SaveThread(Bank bank) {
		this.bank = bank;
	}
	public void run() {
//		bank.save();
		bank.synchronizedSave(); // ͬ���洢
	}
}
