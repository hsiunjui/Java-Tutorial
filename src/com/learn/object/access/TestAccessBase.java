package com.learn.object.access;

/**
 * ����ͬ�����������
 * @author reyshaw
 * ͬ����ͨ����Է��ʰ�����ĳ�private�����г�Ա
 */
public class TestAccessBase {
	public static void main(String[] args) {
		
		AccessBase ab = new AccessBase();
		
		System.out.println(ab.pubAttr);
		System.out.println(ab.proAttr);
		System.out.println(ab.defAttr);
//		System.out.println(ab.priAttr); // X,���������˽������
		
		ab.pubFunc();
		ab.proFunc();
		ab.defFunc();
//		ab.priFunc(); // X,���������˽�з���
	}
}
