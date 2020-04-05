package com.learn.design;
/**
 * 单例模式
 * @author reyshaw
 * 
 */
public class Singleton {
	
	// 将构造器私有化,不允许外面直接new
	private Singleton() {
		System.out.println("Singleton init....");
	}
	
	/*** 饿汉式(以空间换时间) **************/
	// ,内部实例化并保存到静态变量中	
	private static Singleton singletonHungry = new Singleton(); // (较快,线程安全)
	
	// 通过一个公有的静态方法返回实例,给外部调用
	public static Singleton getHungryInstance() { 
		return singletonHungry;
	}
	
	/*** 懒汉式(用时间换空间) ****************/
	// 可能存在线程风险
	// 但可以采用同步锁/双重校验锁/静态内部类/枚举等方式解决
	private static Singleton singletonLazy = null;
	
	public static Singleton getLazyInstance() {
		return singletonLazy == null ? new Singleton() : singletonLazy;
	}
	
	/**
	 * 测试:
	 * Singleton s1 = Singleton.getHungryInstance();
	 * singleton s2 = Singleton.getLazyInstance();
	 * s1 == s2 // true
	 */
	
	/**
	 * 使用场景:
	 * 创建对象占用资源过多,同时又需要用到该类对象
	 * 对系统内资源要求统一读写(如读写配置信息)
	 * 当多个实例存在可能引起程序逻辑错误(如号码生成器)
	 */
}
