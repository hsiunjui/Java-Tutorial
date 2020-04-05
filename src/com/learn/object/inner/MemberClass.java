package com.learn.object.inner;
/**
 * 成员内部内
 * @author reyshaw
 * 1.不能直接实例化,需要借助外部类实例后者方法
 * 2.内部类可以直接访问外部类的属性和方法,内部属性和方法与外部冲突时,优先使用内部的
 * 3.外部类如果要访问内部类的成员,必须通过内部类的实例
 * 4.内部类编译产生的文件是外部类$内部类.class
 */
public class MemberClass { // 外部类
	private int i = 10;
	public MemberClass() {
	}
	
	 //内部类,和成员一样,可以使用所有的访问修饰符
	public class Inner {
//		private int i = 20; // 当内部类有与外部类重名的属性时,优先使用内部的
		int j = 30;
		public Inner() {}
		public void getValueI() {
			// System.out.println(MemberClass.this.i); // 如果冲突,可以使用这种形式访问外部变量
			say(); // 直接调用外部类的私有方法
			System.out.println(i); // 直接访问外部类的私有属性
		}
		
		// 内部同名方法,会优先使用
//		private void say() {
//			System.out.println("Hi!");
//		}
	}
	
	// 外部类的方法
	private void say() {
		Inner inner = new Inner(); // 外部类访问内部类成员
		System.out.println("Inner j: " + inner.j);
	}
	
	// 生成内部内的方法
	public Inner getInterInstance() {
		return new Inner();
	}
}
