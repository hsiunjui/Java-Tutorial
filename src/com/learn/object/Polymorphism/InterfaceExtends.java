package com.learn.object.Polymorphism;
/**
 * 接口继承
 * @author reyshaw
 * 注意：
 * 当InterfaceA,InterfaceB中有相同的常量名时,这里需要显示定义该常量
 * (注意这里不显示定义并不会报错!!!,但在取值的时候就会报错了!!!)
 * 
 * 如果InterfaceA,InterfaceB中都定义了相同的sayHello的default方法,则必须重写该方法
 */

public interface InterfaceExtends extends InterfaceA, InterfaceB {
	int NUM = 1000; // 如果这里不显示定义,则类实例化访问时会报错

	@Override
	default void sayHello() {
		// TODO Auto-generated method stub
		InterfaceA.super.sayHello();
	}
}