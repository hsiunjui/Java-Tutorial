package com.learn.object.inner.test;

import com.learn.object.inner.MethodInnerClass;

public class TestMethodInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodInnerClass mic = new MethodInnerClass();
		
		// 生成实例
		mic.test();
		
		// mic.test().getI(); // 至此内部类的作用域结束,里面的getI等方法都无法调用
	}

}
