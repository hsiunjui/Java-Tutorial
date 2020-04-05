package com.learn.object.thread;

public class Customer extends Thread {
	
	private Goods goods;
	
	public Customer(Goods goods) {
		this.goods = goods;
	}
	
	@Override
	public void run() {
		while(true) { // 一直
			try {
				sleep(1000); // 模拟消费过程
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			goods.custom();	
		}
		
	}
}
