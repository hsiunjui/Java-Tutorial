package com.learn.object.access;
/**
 * 定义父类public/protected/default/private成员
 * @author reyshaw
 * 总结：
 * 1.private只能在内部访问
 * 2.default出了包不能访问
 * 3.protected出了包,子类可以访问
 * 4.public在任何地方都可以访问
 */
public class AccessBase {
	
	public int pubAttr = 1;	// 公共的(任何地方都可以访问)
	
	protected boolean proAttr =  true; // 受保护的(其他包不能访问,不同包子孙类有的可以访问)
	
	float defAttr = 10.4f; // 默认的(不同包的子孙类和其他包不能访问)
	
	private char priAttr = 'c'; // 私有的(只能在内部访问)
	
	public AccessBase() {
		// 子类会默认调用父类的无参构造器
	}
	
	// public function
	public void pubFunc() {
		System.out.println("pubFunc:" + pubAttr);
	}
	
	// protected function
	protected void proFunc() {
		System.out.println("proFunc:" + proAttr);
	}
	
	// default function
	void defFunc() {
		System.out.println("defFunc:" + defAttr);
	}
	
	// private function
	private void priFunc() {
		System.out.println("priFunc:" + priAttr);
	}
	
	// overwrite toString
	@Override
	public String toString() {
		priFunc(); // 为了去除第33行的警告
		return "";
	}
}
