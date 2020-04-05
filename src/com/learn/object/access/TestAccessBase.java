package com.learn.object.access;

/**
 * 测试同包非子类访问
 * @author reyshaw
 * 同包普通类可以访问包内类的除private的所有成员
 */
public class TestAccessBase {
	public static void main(String[] args) {
		
		AccessBase ab = new AccessBase();
		
		System.out.println(ab.pubAttr);
		System.out.println(ab.proAttr);
		System.out.println(ab.defAttr);
//		System.out.println(ab.priAttr); // X,不允许访问私有属性
		
		ab.pubFunc();
		ab.proFunc();
		ab.defFunc();
//		ab.priFunc(); // X,不允许访问私有方法
	}
}
