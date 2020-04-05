package com.learn.object.load;
/**
 * ��ļ���˳��-����
 * @author huawei
 * ��̬�����;�̬���԰�˳��ִ��
 * ��ͨ���Ժ͹�������Ҳ�ǰ�˳��ִ�е�
 */
public class Base {
	// 8.��������
	private String name = "Base";
	
	// 1.���ྲ̬�����
	static {
		System.out.println("base static block");
	}
	
	// 2.���ྲ̬��Ա
	public static boolean isBase;
	
	// 9.���ྲ̬�����
	{
		System.out.println("Base construct block");
	}
	
	// 7.���๹����
	public Base() {
		// super(); // ����и��������ִ��(Ĭ��ִ����Object)
		System.out.println("Base construct"); // 10.ִ�й���������,���๹�����
	}
	
	public String getName() {
		return name;
	}
	
}
