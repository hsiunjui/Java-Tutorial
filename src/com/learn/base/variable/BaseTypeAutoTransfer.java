package com.learn.base.variable;
// Java��������֮���ת��-�Զ�ת��
public class BaseTypeAutoTransfer {
	/**
	 * 1.�Զ�ת���Ǵӵ�λ����λ���е�
	 * 2.int->short->byte���ڷ�Χ�ڵ��Զ�ת��
	 * 3.char����ֻ����int��������ת��,�Ҳ���������Χ
	 * 4.boolean���Ͳ��ܱ��Զ�ת��
	 */
	public static void main(String[] args) {
		/*** byte -> ���� ************************************************************/
		byte b = 127;
		short s = b;
		int i = b;
		long l = b;
		float f = b;
		double d = b;
		char c = 127; // ������ʵ��int��char֮���ת��
		//  c = b; // x,ֻ������������ת��
		// boolean bo = b; // x
		System.out.println("byte->other:" + b + "," + s + "," + i + "," + l + "," + f + "," + d + "," + c);
		
		/*** short -> ���� ************************************************************/
		short s1 = 32767;
		// byte b1 = s1; // x
		int i1 = s1;
		long l1 = s1;
		float f1 = s1;
		double d1 = s1;
		char c1 = 32767; // ������һ��intתchar����ʽ����
		// c1 = s1; // x
		// boolean bo1 = s1; // x
		System.out.println("short->other:" + s1 + "," + i1 + "," + l1 + "," + f1 + "," + d1 + "," + c1);
		
		/*** int -> ���� ************************************************************/
		int i2 = 2147483647;
		// byte b2 = i2; // x
		// short s2 = i2; // x
		long l2 = i2;
		float f2 = i2;
		double d2 = i2;
		char c2 = 65535; 
		// c2 = i2; // x
		 // c2 = 65536; // x, �����ֻ֧��65535
		// boolean bo2 = i2; // x
		System.out.println("int->other:" + i2 + "," + l2 + "," + f2 + "," + d2 + "," + c2);
		
		/*** long -> ���� ************************************************************/
		long l3 = 9223372036854775807L;
		// byte b3 = l3; // x
		// short s3 = l3; // x
		// int i3 = l3; // x
		float f3 = l3; // ��ѧ����,6λС��
		double d3 = l3; // ��ѧ����,15λС��
		// char c3 = i3; // x,ͬ��
		// boolean bo3 = i3; // x
		System.out.println("long->other:" + l3 + "," + f3 + "," + d3);
		
		/*** float -> ���� ************************************************************/
		float f4 = 5.0f;
		// byte b4 = f4; // x
		// short s4 = f4; // x
		// int i4 = f4; // x
		// long l4 = f4; // x
		double d4 = f4;
		// char c4 = f4; // ͬ��
		// boolean bo4 = f4; x
		System.out.println("float->other:" + f4 + "," + d4);
		
		/*** double -> ���� ************************************************************/
		double d5 = 12.0;
		// byte b5 = d5; // x
		// short s5 = d5; // x
		// int i5 = d5; // x
		// long l5 = d5; // x
		// float f5 = d5; // x
		// char c5 = d5; // x,ͬ��
		// boolean bo5 = d5; // x
		System.out.println("double->other:"+ d5);
		
		/*** char -> ���� ************************************************************/
		char c6 = 'a';
		// byte b6 = c6; // x
		// short s6 = c6; // x
		int i6 = c6; // ��ΪcharĬ�Ͽ��Ը�ֵΪint��
		long l6 = c6;
		float f6 = c6;
		double d6 = c6;
		// boolean bo6 = c6; // x
		System.out.println("char->other:" + c6 + "," + i6 + "," + l6 + "," + f6 + "," + d6);
		
		/*** boolean -> ���� ************************************************************/
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
