package com.learn.object;
/**
 * �����{}
 * @author reyshaw
 * 1.��̬����������ִ��(������ص�ʱ��)
 * 2.������������ڹ�����ִ��
 * 3.�����еĴ�����൱�ڿ�����һ����ʱ������
 */
public class CodeBlock {
	// ˽������
	private String name = "hello world";
	
	 // ��̬�����
	static {
		System.out.println("��̬�����er....");
	}
	
	// ��̬��Ա
	private static int var;
	
	// ��������
	{
		System.out.println("��������er...");
	}
	
	// ������
	public CodeBlock() {
		System.out.println("������..." + name);
	}
	
	// ����
	public String getName() {
		{ // �ֲ������
			System.out.println("1111");
		}
		return name;
	}
	
	public static int getVar() {
		return var;
	}
}
