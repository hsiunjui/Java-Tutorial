package com.learn.object.thread;

/**
 * ȡ���߳�
 * @author reyshaw
 *
 */
public class DrawThread extends Thread {
	private Bank bank;
	
	public DrawThread(Bank bank) {
		this.bank = bank;
	}
	
	public void run() {
//		bank.draw();
		bank.synchronizedDraw(); // ͬ��ȡ��
	}
}
