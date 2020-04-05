package com.learn.object.extend;

public class Base {
	public String pub = "pub";
	protected String pro = "pro";
	String def = "def";
	private String pri = "pri";
	
	public static final String STATIC = "static"; // ����
	
	// �޲ι�����,����д��ι�����,������û����ʾ����,�޲ι���������Ҫ��ʾ����
	public Base() {
		
	}
	
	// ���з���
	public String getPub() {
		System.out.println("public getPub()");
		return pub;
	}
	// �ܱ����Եķ���
	protected String getPro() {
		System.out.println("protected getPro()");
		return pro;
	}
	// Ĭ���Եķ���
	String getDef() {
		System.out.println("default getDef()");
		return def;
	}
	// ˽�з���
	private String getPri() {
		System.out.println("private getPri()");
		return pri;
	}
	
	// Ϊ�����˽�з����ṩ�ӿ�
	public String getPri1() {
		System.out.println("public getPri1()");
		return getPri();
	}
	
	// ��̬����
	protected static void pubStatic() {
		System.out.println("Base public static pubStatic");
	}
}
