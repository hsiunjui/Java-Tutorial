package com.learn.object.extend;

public class TestChild {
	public static void main(String[] args) {
		Child child = new Child();
		
		//  访问属性
		System.out.println(child.pub);
		System.out.println(child.pro);
		System.out.println(child.def);
		// System.out.println(child.pri); // X,私有属性不允许访问
			
		// 访问方法
		child.getPub();
		child.getPro(); // 这个方法访问的是子类重写后的方法
		child.getDef();
//		child.getPri(); // X,私有方法不能访问
		
		// 访问静态方法
		Child.pubStatic();
		
		// 访问静态属性
		System.out.println(Child.STATIC);
		
		// 通过子类方法访问父类
		child.getSuperInfo();
	}
}
