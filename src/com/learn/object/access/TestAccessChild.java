package com.learn.object.access;

/**
 * 测试在子类外部访问及内部访问(该测试类必须位于同一包内)
 * @author reyshaw
 * 可以访问除private外的所有成员
 */
public class TestAccessChild {
	
	public static void main(String[] args) {
		AccessChild ac = new AccessChild();
		
		/*** 在类外部访问 ***/
		System.out.println(ac.pubAttr);
		System.out.println(ac.proAttr);
		System.out.println(ac.defAttr);
		// System.out.println(ac.priAttr); // X, 需允许访问私有属性
		ac.pubFunc();
		ac.proFunc();
		ac.defFunc();
		// ac.priFunc(); // X,不允许访问私有方法
		
		/*** 在类内部访问 ***/
		ac.getAccessBaseAttr();
	}
}
