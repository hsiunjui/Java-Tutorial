package com.learn.object.inner.test;

import com.learn.object.inner.StaticInnerClass;

public class TestStaticInnerClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/***** ��̬�ڲ��� ****/
		// ���ⲿֱ�ӷ����ڲ���ľ�̬��Ա
		System.out.println(StaticInnerClass.Inner.staticVar);
		
		// �����ڲ���ķǾ�̬����
		StaticInnerClass.Inner sicInner = new StaticInnerClass.Inner();
		sicInner.getI();

	}

}
