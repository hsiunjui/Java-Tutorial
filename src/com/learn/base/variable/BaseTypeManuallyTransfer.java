package com.learn.base.variable;
// Java基本类型之间的转换-强制转换
public class BaseTypeManuallyTransfer {
	/**
	 * 1.与自动转换相反,强制转换是从高位到低位的
	 * 2.转换时注意接收方的范围,否则会丢失精度
	 * 3.整型和浮点型之间转换(超出范围后会出现最大值和-1的情况,需要深入了解浮点数存储机制)
	 * 4.char类型的转换要注意其字符的表示范围
	 * 5.boolean类型的不能进行转换
	 */
	public static void main(String[] args) {
		/*** 其他 ->byte ************************************************************/
		short s = 127; // 127
		int i = 128; // -128,溢出
		long l = 65535; // -1,溢出
		float f = 127.01f; // 127
		double d = -1129.01; // -105,溢出
		char c = 'a'; // 隐式转成了int,然后再强制转成了byte
		// boolean bo =(byte)true; // x
		System.out.println("other->byte:" + (byte)s + "," +(byte)i + "," + (byte)l + "," + (byte)f + "," + (byte)d + "," + (byte)c);
		
		
		/*** 其他 -> short ************************************************************/
		int i1 = 32767; // 32767
		long l1 = 32768; // -32768, 溢出
		float f1 = 33.121f; // 33
		double d1 = 32768.12; // -32786,溢出
		char c1 = '翿'; // 32767,超过这个unicode值会溢出,先自动转成了int,再强制转成了short
		// boolean bo1 = (short)true; // x
		System.out.println("other->short:" + (short)i1 + "," + (short)l1 + "," + (short)f1 + "," + (short)d1 + "," + (short)c1);
		
		/*** 其他 -> int ************************************************************/
		long l2 = 2147483647; // 2147483647
		float f2 = 9223372036854775807.01f; // 2147483647
		double d2 = 21474836481.01; // 2147483647
		char c2 = '�'; // 65533,最大允许Unicode码是65535的字符
		// boolean bo2 =(int)true; // x
		System.out.println("other->int:" + "," + (int)l2 + "," + (int)f2 + "," + (int)d2 + "," + (int)c2);
		
		/*** 其他 -> long  ************************************************************/
		float f3 = 92233720368547758071.2f; //9223372036854775807
		double d3 = 10.43455; // 10
		char c3 = '�'; // 同上
		// boolean bo3 = (long)true; // x
		System.out.println("other->long:" + (long)f3 + "," + (long)d3 + "," + (long)c3);
		
		/*** float -> 其他(可能会丢失精度)  *********************************************/
//		float f4 = 5.0f;
		double d4 = 1293434.122343443434; // 1293434.1,丢失精度
		char c4 = '�'; // 65533.0,这里先是将char转int,然后int->float
		// boolean bo4 = (float)true; x
		System.out.println("float->other:" + (float)d4 + "," + (float)c4);
		
		/*** 其他 -> double (可以直接向高位转) ************************************************/
		double d5 = 12.0;
		// boolean bo5 = d5; // x
		System.out.println("double->other:"+ d5);
		
		/*** char -> 其他 (需要在Unicode值的范围)*******************************************/
//		char c6 = 'a';
		byte b6 = 97; // a
		short s6 = 97; // a
		int i6 = 97; // a,需要在char的范围,以下同
		long l6 = 97; // a
		float f6 = 97.0f; // a
		double d6 = 97.0; // a
		// boolean bo6 = char(true); // x
		System.out.println("other->char:" + (char)b6 + "," + (char)s6 + "," + (char)i6 + "," + (char)l6 + "," + (char)f6 + "," + (char)d6);
		
		/*** 其他 -> boolean (不能转换)****************************************************/
		boolean bo7 = true;
		System.out.println("other->boolean:" + bo7);
	}
}
