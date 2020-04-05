package com.learn.object.thread;

public class Producer extends Thread {
	private Goods goods;
	
	public Producer(Goods goods) {
		this.goods = goods;
	}
	
	@Override
	public void run() {
		while(true) { // 一直生产
			try {
				sleep(1000); // 模拟生产过程
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			goods.produce();	
		}
	}
}
