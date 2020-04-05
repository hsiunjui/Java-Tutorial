package com.learn.object.Polymorphism;

public interface InterfaceB {
	
	int NUM = 100;
	
	public void say();
	
	default void sayHello() {
		System.out.println("world!");
	}
}
