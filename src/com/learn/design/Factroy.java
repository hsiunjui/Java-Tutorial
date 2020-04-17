package com.learn.design;
/**
 * 
 * @author reyshaw
 * 开闭原则(扩展开放,修改关闭)
 * 迪米特原则(不和陌生人说话)
 */
public class Factroy {
	public static O createObject(String name) {
		O o = null;
		// 简单工厂,即把所有生产的类放在一个方法里
		if(name.equals("A")) {
			o = new A();
		} else if(name.equals("B")) {
			o = new B();
		}
		return o;
	}
	
	// 利用反射
	@SuppressWarnings("deprecation")
	public static O createByForName(String name) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		return (O)Class.forName(name).newInstance();
	}
}

// 定义统一标准
interface O {
	public void go();
}

// 如果创建类的过程比较复杂,则可以再拆分成单个工厂,总工厂下再用简单工厂创建具体的工厂
class A implements O {
	public void go() {
		System.out.println("A is going...");
	}
}

class B implements O {
	public void go() {
		System.out.println("B is going...");
	}
}