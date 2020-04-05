package com.learn.base.variable;
//Java的基本数据类型(三类八种)
public class BaseType {
	/**
	 * 1.数值型和字符型可以有数字、字符、Unicode码、Unicode的十进制int型表示
	 * 2.各类型是由范围的(包装类获取),其中浮点型是一个并集
	 * 3.如果跨变量类型赋值(如把char赋给byte),必须是字面量,且要注意边界
	 * 4.布尔类型只能是布尔值
	 * 5.字面量在赋值给高位变量类型的时候有一个自动转换的过程(如给float直接给一个int字面量)
	 */
	public static void main(String[] args) {
		/*** byte **************************************************************************************/
		byte b = 1; // 1个字节,8个二进制位
		// b = 128; // 报错：cannot convert from int to byte
		b = 'a'; // 标准ASCII码值
		b = '\u0061'; // 支持Unicode编码, 到\u007f(127)
		// b = ''; // 报错,char必须给值,但可以是 b = ' '; 空格
		// char c = 'b'; b = c // 报错,如果不是本类型,兼容类型只能赋字面量,不能是变量
		System.out.println("[btye] Min:" + Byte.MIN_VALUE + "; Max:" + Byte.MAX_VALUE); // [byte] Min:-128, Max:127
		
		/*** short **************************************************************************************/ 
		short s = 32767; // 2个字节,16个二进制位
		s = '€'; // 同byte,但是可以是扩展的ASCII码,当前的字符是扩展的ASCII码表的128号
		s = '中'; // Unicode字符,可以是任意的
		s = 20013; // Unicode的十进制形式
		s = '\u4e2d'; // Unicode字符编码
		// s = ''; // 同样不能位空
		System.out.println("[short] Min:" + Short.MIN_VALUE + "; Max:" + Short.MAX_VALUE); // [short] Min:-32768, Max:32767

		/*** int **************************************************************************************/ 
		int i = 129; // 4个字节,32个二进制位,字面量不加后缀默认是int的
		i = '©'; // 同上,169号
		System.out.println("[int] Min:" + Integer.MIN_VALUE + "; Max:" + Integer.MAX_VALUE); // [int] Min:-2147483648, Max:2147483647
		
		/*** long **************************************************************************************/ 
		long l = 4L; // 8个字节,64个二进制位
		l = 4; // 把int的4自动转成了long类型
		l = '¾'; // 同上,190号
		System.out.println("[long] Min:" + Long.MIN_VALUE + "; Max:" + Long.MAX_VALUE); // [long] Min:-9223372036854775808, Max:9223372036854775807
		
		/*** float **************************************************************************************/ 
		float f = 1.1F; // 4个字节,32个二进制位 <完整范围:[-3.40282346638528860e+38 , -1.40129846432481707e-45] ∪ [1.40129846432481707e-45 ~ 3.40282346638528860e+38] >
		f = 10; // 是把int的10自动转换为float
		f = 10L; // 把long类型自动转成了float
		f = 'ß'; // 同上,223号
		System.out.println("[float] Min:" + Float.MIN_VALUE + "; Max:" + Float.MAX_VALUE); // [float] Min:1.4E-45, Max:3.4028235E38 (39位正整数)
		/*** double **************************************************************************************/ 
		double d = 1.2; // 8个字节,64个二进制位, <完整范围: [-1.79769313486231570e+308,-4.94065645841246544e-324] ∪  [4.94065645841246544e-324,1.79769313486231570e+308] >
		d = 20; // 把int的20转为了double
		d = 20L; // 把long类型的转成了double
		d = 'ÿ'; // 同上,255号
		System.out.println("[double] Min:" + Double.MIN_VALUE + "; Max:" + Double.MAX_VALUE); // [double] Min:4.9E-324, Max:1.7976931348623157E308(309位正整数)
		
		/*** char **************************************************************************************/ 
		char c = 'a'; // 2个字节,16个二进制位
		c = '1'; //这是1这个字符,ASSCI码是49,如果要输出1这个字符,需要c=49
		c = 20013; // 可以是int类型
		c = '中'; // 字符
		c = '\u4e2d'; // unicode形式
		// c = 15L; 不能是long类型
		System.out.println("[char] Min:" + (int)Character.MIN_VALUE + "; Max:" + (int)Character.MAX_VALUE); // [char] Min:0, Max:65535
		
		/*** boolean **************************************************************************************/
		boolean bo = true; // 占1个字节,8个二进制位
		System.out.println("byte:" + b + ", short:" + s + ",int:" + i + ",long:" + l + ",float:" + f + ",double:" + d + ",char:" + c + ",boolean:" + bo);
	}

}
