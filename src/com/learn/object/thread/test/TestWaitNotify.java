package com.learn.object.thread.test;

import com.learn.object.thread.Customer;
import com.learn.object.thread.Goods;
import com.learn.object.thread.Producer;

public class TestWaitNotify {

	public static void main(String[] args) {

		Goods goods = new Goods();
		Producer producer = new Producer(goods);
		Customer customer = new Customer(goods);
		
		// ��ʼ����������
		producer.start();
		customer.start();

	}

}
