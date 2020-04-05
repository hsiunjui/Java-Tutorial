package com.learn.object;
/**
 * ����һ����
 * class�ؼ���ֻ�ܱ�public/abstract/final����(�ڲ������)
 * @author reyshaw
 */
public class Declare {
	private String name; // ��Ա
	private static int num = 0; // ��̬��Ա
	
	// �޲ι�����(Ĭ�ϻ���һ���޲ι�����)
	public Declare() {
		System.out.println("DeclareClass���޲ι�����...");
	}
	
	// �������Ĺ�����(��������˴��ι�����,Ҫʹ���޲ι���������Ҫ��ʾ����)
	public Declare(String name) throws Exception {
		this.setName(name);
	}
	
	// ��Ա��get����
	public String getName() {
		return this.name;
	}
	
	// ��Ա��set����
	public void setName(String name) throws Exception {
		if(name.length() >= 2) {
			this.name = name;
		} else {
			throw new Exception("name����2λ�������ַ�");
		}
	}
	
	// ��̬����
	public static void printInfo(Declare dc) {
		System.out.println("Name:" + dc.getName() +", Static num:" + num);
	}
}
