package com.learn.object.thread;

/**
 * 存款线程
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
		bank.synchronizedSave(); // 同步存储
	}
}
