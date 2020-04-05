package com.learn.object.inner.test;

import com.learn.object.inner.MemberClass;

public class TestMemberClass {
	public static void main(String[] args) {
		/****** 成员内部类 ******/
		MemberClass.Inner inner = new MemberClass().new Inner(); //  方式一
		inner.getValueI();
		inner = new MemberClass().getInterInstance(); // 方式二,通过外部类的方法
		inner.getValueI();
		
	}
}
