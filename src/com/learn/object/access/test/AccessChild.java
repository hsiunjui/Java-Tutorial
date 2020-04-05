package com.learn.object.access.test;

import com.learn.object.access.AccessBase;

/**
 * 不同包下子类,除了private和default成员外,均可
 * @author reyshaw
 *
 */

public class AccessChild extends AccessBase {
	
	public void getAccessBaseAttr() {
		
		/*** 属性的访问 ***/
		System.out.println(super.pubAttr);
		System.out.println(super.proAttr); // 跨包继承,内部可以访问到protected属性(但外部是不能访问的)
//		System.out.println(super.defAttr); // 不同包,default属性允许
//		System.out.println(super.priAttr); // 不同包,private属性,不允许
		
		/*** 方法的访问 ***/
		super.pubFunc();
		super.proFunc();
//		super.defFunc(); // 不同包,default方法不允许
//		super.priFunc(); // private方法,不允许
	}
}
