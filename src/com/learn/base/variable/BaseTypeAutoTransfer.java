package com.learn.base.variable;
// Java基本类型之间的转换-自动转换
public class BaseTypeAutoTransfer {
	/**
	 * 1.自动转换是从低位到高位进行的
	 * 2.int->short->byte是在范围内的自动转换
	 * 3.char类型只接受int字面量的转换,且不允许超出范围
	 * 4.boolean类型不能被自动转换
	 */
	public static void main(String[] args) {
		/*** byte -> 其他 ************************************************************/
		byte b = 127;
		short s = b;
		int i = b;
		long l = b;
		float f = b;
		double d = b;
		char c = 127; // 这里其实是int和char之间的转换
		//  c = b; // x,只能是字面量的转换
		// boolean bo = b; // x
		System.out.println("byte->other:" + b + "," + s + "," + i + "," + l + "," + f + "," + d + "," + c);
		
		/*** short -> 其他 ************************************************************/
		short s1 = 32767;
		// byte b1 = s1; // x
		int i1 = s1;
		long l1 = s1;
		float f1 = s1;
		double d1 = s1;
		char c1 = 32767; // 这里有一个int转char的隐式过程
		// c1 = s1; // x
		// boolean bo1 = s1; // x
		System.out.println("short->other:" + s1 + "," + i1 + "," + l1 + "," + f1 + "," + d1 + "," + c1);
		
		/*** int -> 其他 ************************************************************/
		int i2 = 2147483647;
		// byte b2 = i2; // x
		// short s2 = i2; // x
		long l2 = i2;
		float f2 = i2;
		double d2 = i2;
		char c2 = 65535; 
		// c2 = i2; // x
		 // c2 = 65536; // x, 但最大只支持65535
		// boolean bo2 = i2; // x
		System.out.println("int->other:" + i2 + "," + l2 + "," + f2 + "," + d2 + "," + c2);
		
		/*** long -> 其他 ************************************************************/
		long l3 = 9223372036854775807L;
		// byte b3 = l3; // x
		// short s3 = l3; // x
		// int i3 = l3; // x
		float f3 = l3; // 科学计数,6位小数
		double d3 = l3; // 科学计数,15位小数
		// char c3 = i3; // x,同上
		// boolean bo3 = i3; // x
		System.out.println("long->other:" + l3 + "," + f3 + "," + d3);
		
		/*** float -> 其他 ************************************************************/
		float f4 = 5.0f;
		// byte b4 = f4; // x
		// short s4 = f4; // x
		// int i4 = f4; // x
		// long l4 = f4; // x
		double d4 = f4;
		// char c4 = f4; // 同上
		// boolean bo4 = f4; x
		System.out.println("float->other:" + f4 + "," + d4);
		
		/*** double -> 其他 ************************************************************/
		double d5 = 12.0;
		// byte b5 = d5; // x
		// short s5 = d5; // x
		// int i5 = d5; // x
		// long l5 = d5; // x
		// float f5 = d5; // x
		// char c5 = d5; // x,同上
		// boolean bo5 = d5; // x
		System.out.println("double->other:"+ d5);
		
		/*** char -> 其他 ************************************************************/
		char c6 = 'a';
		// byte b6 = c6; // x
		// short s6 = c6; // x
		int i6 = c6; // 因为char默认可以赋值为int的
		long l6 = c6;
		float f6 = c6;
		double d6 = c6;
		// boolean bo6 = c6; // x
		System.out.println("char->other:" + c6 + "," + i6 + "," + l6 + "," + f6 + "," + d6);
		
		/*** boolean -> 其他 ************************************************************/
		boolean bo7 = true;
		// byte b7 = bo7; // x
		// short s7 = bo7; // x
		// int i7 = bo7; // x
		// long l7 = bo7; // x
		// float f7 = bo7; // x
		// double d7 = bo7; // x
		// char c7 = bo7; // x
		System.out.println("boolean->other:" + bo7);
	}
}
