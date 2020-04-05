package com.learn.object.access.test;

/**
 * 不同包的子类测试
 * @author reyshaw
 * 只能访问public成员
 */
public class TestAccessChild {
	
	public static void main(String[] args) {
		AccessChild ac = new AccessChild();
		
		/*** 在类外部访问 ***/
		System.out.println(ac.pubAttr);
//		System.out.println(ac.proAttr); // X, 因为protected不能跨包访问
//		System.out.println(ac.defAttr); // X
//		System.out.println(ac.priAttr); // X
		ac.pubFunc();
//		ac.proFunc(); // X
//		ac.defFunc(); // X
//		 ac.priFunc(); // X
		
		/*** 在类内部访问 ***/
		ac.getAccessBaseAttr();
	}
}
