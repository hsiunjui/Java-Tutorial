package com.learn.object.inner.test;

import com.learn.object.inner.StaticInnerClass;

public class TestStaticInnerClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/***** 静态内部类 ****/
		// 在外部直接访问内部类的静态成员
		System.out.println(StaticInnerClass.Inner.staticVar);
		
		// 访问内部类的非静态方法
		StaticInnerClass.Inner sicInner = new StaticInnerClass.Inner();
		sicInner.getI();

	}

}
