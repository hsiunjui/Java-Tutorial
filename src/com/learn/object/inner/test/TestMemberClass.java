package com.learn.object.inner.test;

import com.learn.object.inner.MemberClass;

public class TestMemberClass {
	public static void main(String[] args) {
		/****** ��Ա�ڲ��� ******/
		MemberClass.Inner inner = new MemberClass().new Inner(); //  ��ʽһ
		inner.getValueI();
		inner = new MemberClass().getInterInstance(); // ��ʽ��,ͨ���ⲿ��ķ���
		inner.getValueI();
		
	}
}
