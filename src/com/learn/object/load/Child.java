package com.learn.object.load;
/**
 * ����ļ���˳��
 * @author reyshaw
 * 1.LoadClass,����Ҫ�õ�������ص������
 * 2.���ظ���ľ�̬��Ա(��̬�����,����)
 * 3.��������ľ�̬��Ա
 * 4.ִ��new ����,�������๹����
 * 5.���๹��������ø���Ĺ�����(Ĭ���޲�)
 * 6.���๹����ִ��ǰ����ִ�����Ը�ֵ�͸��๹������
 * 7.ִ�и��๹����,���๹�����
 * 8.�ص����๹����,ִ�����Ը�ֵ�����๹������
 * 9.ִ�����๹����,������๹��
 * 10.���
 */
public class Child extends Base {
	
	// 11.��������
	private int age = 10;
	
	 // 3.���ྲ̬�����
	static {
		System.out.println("Child static block");
	}
	
	// 4.���ྲ̬����
	public static char gender;
	
	 // 12.���๹������
	{
		System.out.println("Child construct block");
	}
	
	 // 5.���๹����
	public Child() {
		super(); // 6.ִ�и��๹��
		System.out.println("Child construct"); // 13.ִ�����๹��,���๹�����
	}
	
	public int getAge() {
		return age;
	}
}
