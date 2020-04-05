package com.learn.object.thread.test;

import com.learn.object.thread.Bank;
import com.learn.object.thread.DrawThread;
import com.learn.object.thread.SaveThread;

public class TestSynchronized {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		
		// 单线程执行,没有问题
		//		bank.save(); // 110
		//		bank.draw(); // 100
		
		SaveThread st = new SaveThread(bank);
		DrawThread dt = new DrawThread(bank);
		
		st.start(); // 开始存 如果没有同步,100,110,90都有可能
		try {
			st.join();  // 先存再取,如果不加这个可能时先取后存, join需要紧跟在当前线程start后面,其他线程start前面
//			dt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		dt.start(); // 开始取
		

	}

}
