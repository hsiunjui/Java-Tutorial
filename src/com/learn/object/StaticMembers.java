package com.learn.object;
/**
 * 非静态可以访问非静态和静态
 * 静态不能访问非静态
 * @author reyshaw
 *
 */
public class StaticMembers {
	public static void main(String[] args) {
		BaseClass bc = new BaseClass();
		BaseClass.printName(bc); // 调用静态方法
		bc.printI(); // 调用非静态方法
	}
}

/**测试类**/
class BaseClass {
	private int i = 10;
	private static String name = "BaseClass";
	
	 // 非静态方法访问非静态成员
	public void getI() {
		System.out.println("getI() -> i:" + i); // this.i;
	}
	
	// 非静态方法访问非静态方法/静态成员/静态方法
	public void printI() {
		getI(); //非静态方法访问非静态方法
		System.out.println("printI() -> getI():");
		System.out.println("printI() -> static name:" + name); // this.name; BaseClass.name; 非静态方法访问静态成员
		printName(this); // this.printName(); BaseClass.printName(); 非静态方法访问静态方法
		System.out.println("printI() -> static printName()");
	}
	
	// 静态方法访问静态成员(静态方法里不可以使用this!!!)
	public static void getName() {
		// i++; // x,不能访问非静态成员
		// getI()++; // x,不能访问非静态方法
		System.out.println("static getName() -> static name:" + name); // BaseClass.name;
	}
	
	// 静态方法访问静态方法
	public static void printName(BaseClass bc) {
		bc.getI(); // 静态方法调用非静态方法的方案
		getName(); // BaseClass.getName(); 静态方法访问静态方法
		System.out.println("static printName() -> static getName()");
	}
}
