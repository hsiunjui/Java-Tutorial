package com.learn.object.access.test;

import com.learn.object.access.AccessBase;

/**
 * 不同包非子类访问
 * @author reyshaw
 * 不同包非子类,只可以访问public成员
 */
public class TestAccessBase {
	public static void main(String[] args) {
		
		AccessBase ab = new AccessBase();
		
		System.out.println(ab.pubAttr);
//		System.out.println(ab.proAttr); // X,不同包,不允许访问protected属性
//		System.out.println(ab.defAttr); // X,不同包,不允许访问default属性
//		System.out.println(ab.priAttr); // X,不同包,不允许访问private属性
		
		ab.pubFunc();
//		ab.proFunc(); // X,不同包,不允许访问protected方法
//		ab.defFunc(); // X,不同包,不允许访问default方法
//		ab.priFunc(); // X,不同包,不允许访问private方法
	}
}
