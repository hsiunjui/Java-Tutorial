package com.learn.object;

public class PackageClass {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**** 装箱与拆箱操作 ****/
		System.out.println("=========装箱=============");
		// 装箱
		Integer i = 10; // 自动装箱
		System.out.println(i.intValue());
		i = new Integer(100); // 手动装箱
		System.out.println(i.intValue());
		System.out.println("=========拆箱=============");
		// 拆箱
		int j = i;
		System.out.println(j); // 自动拆箱
		j = i.intValue(); // 手动拆箱
		System.out.println(j);
		
		/***** 字符串与基本类型 ****/
		// 基本类型转字符串(包装类.toString();
		String str = Integer.toString(i);
		System.out.println("=========基本类型转字符串=============");
		System.out.println(str);
		// 字符串类型转基本类型
		j = Integer.parseInt(str); // str必须时number型字面量,其他类型必须时其他类型的字面量
		j = Integer.valueOf(str);
		// j = Integer.parseInt("a"); // 会报NumberFormatException
		System.out.println("=========字符串转基本类型=============");
		System.out.println(j);
		
		/*** 包装类比较 (注意缓存池的概念)**/
		Integer a = new Integer(127);
		Integer b = new Integer(127);
		System.out.println("=========比较两个装箱类型=============");
		System.out.println(a == b); // false,两个不同的引用
		System.out.println(a); // 100,自动拆箱
		System.out.println(a == 127); // true,只能是字面量相比较的时候才会出现这个结果
		a  = 127; // 这里有个缓存池的概念
		System.out.println(a == b); // false,变量间内存不同
		// a = Integer.valueOf(100); , 参数再-128 ~ 127之间,默认调用这个方法
		// a = new Integer(128); // 参数大于那个范围,默认调用
		b = 127;
		System.out.println(a == b); // true
		a = 128; // 因为超出-128-127的方位,调用的额时new Integer(128)
		b = 128;
		System.out.println(a ==b); // false

	}

}
