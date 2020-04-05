package com.learn.object.thread;
/**
 * һ��һ�������ѹ�ϵ(����)
 * @author reyshaw
 * 1.����һ��,����һ��
 */
public class Goods {
	private int produceId;
	private int customId;
	private boolean hasGood = false; // �ж��Ƿ�Ҫ����,�����Ƿ�������
	public Goods() {}
	
	// ����
	public synchronized void produce() {
		if(hasGood) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else { // �������һ��һ,��ֻ������Ĵ���,һֱ����
			System.out.println("��ƷId:"+ ++produceId );
			notifyAll();
			hasGood = true;
		}
	}
	
	// ����
	public synchronized void custom() {
		if(!hasGood) { // ���û����Ʒ��wait
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("���Ѵ���:" + ++customId + ", ���Ѳ�ƷIdΪ:" + produceId + " ,produceId == customId: " + (produceId == customId));	
			notifyAll();
			hasGood = false;
		}
	}
}
