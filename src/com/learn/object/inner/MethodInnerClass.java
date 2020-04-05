package com.learn.object.inner;
/**
 * 方法内部类(局部内部类)
 * @author reyshaw
 * 1.方法内部类不允许有访问修饰符(因为局部变量不允许有访问修饰符)
 * 2.类中不能包含静态成员,可以有final,可以时抽象类(极少用)
 * 3.跟局部作用域一样,出了这个方法,均失效了
 * 4.编译后内部类的文件名时外部类$1内部类.class
 */
public class MethodInnerClass {
	public int var = 10;
	
	public MethodInnerClass() {
		
	}
	public Object test() { // (没啥意义,因为外面已经出局部作用域了)
		int i = 20;
		class Inner {
//			public int i = 20;
			public Inner() {
				print();
			}
			public void print() {
				System.out.println(var); // 
				System.out.println(i);
			}
		}
		return new Inner();
		// new Inner().print();
	}
}
