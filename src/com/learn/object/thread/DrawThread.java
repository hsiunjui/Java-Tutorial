package com.learn.object.thread;

/**
 * 取款线程
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
		bank.synchronizedDraw(); // 同步取出
	}
}
