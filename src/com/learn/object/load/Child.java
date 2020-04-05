package com.learn.object.load;
/**
 * 子类的加载顺序
 * @author reyshaw
 * 1.LoadClass,把需要用到的类加载到虚拟机
 * 2.加载父类的静态成员(静态代码块,属性)
 * 3.加载子类的静态成员
 * 4.执行new 操作,调用子类构造器
 * 5.子类构造器会调用父类的构造器(默认无参)
 * 6.父类构造器执行前会先执行属性赋值和父类构造代码块
 * 7.执行父类构造器,父类构造完成
 * 8.回到子类构造器,执行属性赋值和子类构造代码块
 * 9.执行子类构造器,完成子类构造
 * 10.完成
 */
public class Child extends Base {
	
	// 11.子类属性
	private int age = 10;
	
	 // 3.子类静态代码块
	static {
		System.out.println("Child static block");
	}
	
	// 4.子类静态属性
	public static char gender;
	
	 // 12.子类构造代码块
	{
		System.out.println("Child construct block");
	}
	
	 // 5.子类构造器
	public Child() {
		super(); // 6.执行父类构造
		System.out.println("Child construct"); // 13.执行子类构造,子类构造完成
	}
	
	public int getAge() {
		return age;
	}
}
