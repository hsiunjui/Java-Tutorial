package com.learn.object.thread;
/**
 * 一对一生产消费关系(队列)
 * @author reyshaw
 * 1.生产一个,消费一个
 */
public class Goods {
	private int produceId;
	private int customId;
	private boolean hasGood = false; // 判断是否要生产,或者是否能消费
	public Goods() {}
	
	// 生产
	public synchronized void produce() {
		if(hasGood) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else { // 如果不是一对一,则只用下面的代码,一直生产
			System.out.println("产品Id:"+ ++produceId );
			notifyAll();
			hasGood = true;
		}
	}
	
	// 消费
	public synchronized void custom() {
		if(!hasGood) { // 如果没有商品就wait
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("消费次数:" + ++customId + ", 消费产品Id为:" + produceId + " ,produceId == customId: " + (produceId == customId));	
			notifyAll();
			hasGood = false;
		}
	}
}
