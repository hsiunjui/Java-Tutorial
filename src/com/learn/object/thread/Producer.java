package com.learn.object.thread;

public class Producer extends Thread {
	private Goods goods;
	
	public Producer(Goods goods) {
		this.goods = goods;
	}
	
	@Override
	public void run() {
		while(true) { // һֱ����
			try {
				sleep(1000); // ģ����������
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			goods.produce();	
		}
	}
}
