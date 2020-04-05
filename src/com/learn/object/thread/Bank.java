package com.learn.object.thread;
/**
 * 银行类
 * @author reyshaw
 * 为了方便,这里没有使用get/set方法
 * synchronized修饰的方法或者块,不允许其他线程插进来
 */
public class Bank {
	private int balance = 100; // 
	
	// 获取余额
	public int getBalance() {
		return balance;
	}
	// 存
	public void save() {
		balance += 10; // 可能执行这一句后,就跳到其他线程执行了
		System.out.println("balance after saved: " + getBalance());
	}
	// 取
	public void draw() {
		balance -= 10;
		System.out.println("balance after draw: " + getBalance());
	}
	
	// 同步存
	public synchronized void synchronizedSave() {
		this.save();
	}
	
	// 同步取
	public  void synchronizedDraw() {
		synchronized(this) { // 只是两种不同的表示方式
			balance -= 10;
			System.out.println("balance after draw: " + getBalance());
		}
	}
}
