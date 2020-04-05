package com.learn.object.thread;

public class Customer extends Thread {
	
	private Goods goods;
	
	public Customer(Goods goods) {
		this.goods = goods;
	}
	
	@Override
	public void run() {
		while(true) { // һֱ
			try {
				sleep(1000); // ģ�����ѹ���
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			goods.custom();	
		}
		
	}
}
