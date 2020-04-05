package com.learn.design;
/**
 * ����ģʽ
 * @author reyshaw
 * 
 */
public class Singleton {
	
	// ��������˽�л�,����������ֱ��new
	private Singleton() {
		System.out.println("Singleton init....");
	}
	
	/*** ����ʽ(�Կռ任ʱ��) **************/
	// ,�ڲ�ʵ���������浽��̬������	
	private static Singleton singletonHungry = new Singleton(); // (�Ͽ�,�̰߳�ȫ)
	
	// ͨ��һ�����еľ�̬��������ʵ��,���ⲿ����
	public static Singleton getHungryInstance() { 
		return singletonHungry;
	}
	
	/*** ����ʽ(��ʱ�任�ռ�) ****************/
	// ���ܴ����̷߳���
	// �����Բ���ͬ����/˫��У����/��̬�ڲ���/ö�ٵȷ�ʽ���
	private static Singleton singletonLazy = null;
	
	public static Singleton getLazyInstance() {
		return singletonLazy == null ? new Singleton() : singletonLazy;
	}
	
	/**
	 * ����:
	 * Singleton s1 = Singleton.getHungryInstance();
	 * singleton s2 = Singleton.getLazyInstance();
	 * s1 == s2 // true
	 */
	
	/**
	 * ʹ�ó���:
	 * ��������ռ����Դ����,ͬʱ����Ҫ�õ��������
	 * ��ϵͳ����ԴҪ��ͳһ��д(���д������Ϣ)
	 * �����ʵ�����ڿ�����������߼�����(�����������)
	 */
}
