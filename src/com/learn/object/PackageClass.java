package com.learn.object;

public class PackageClass {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**** װ���������� ****/
		System.out.println("=========װ��=============");
		// װ��
		Integer i = 10; // �Զ�װ��
		System.out.println(i.intValue());
		i = new Integer(100); // �ֶ�װ��
		System.out.println(i.intValue());
		System.out.println("=========����=============");
		// ����
		int j = i;
		System.out.println(j); // �Զ�����
		j = i.intValue(); // �ֶ�����
		System.out.println(j);
		
		/***** �ַ������������ ****/
		// ��������ת�ַ���(��װ��.toString();
		String str = Integer.toString(i);
		System.out.println("=========��������ת�ַ���=============");
		System.out.println(str);
		// �ַ�������ת��������
		j = Integer.parseInt(str); // str����ʱnumber��������,�������ͱ���ʱ�������͵�������
		j = Integer.valueOf(str);
		// j = Integer.parseInt("a"); // �ᱨNumberFormatException
		System.out.println("=========�ַ���ת��������=============");
		System.out.println(j);
		
		/*** ��װ��Ƚ� (ע�⻺��صĸ���)**/
		Integer a = new Integer(127);
		Integer b = new Integer(127);
		System.out.println("=========�Ƚ�����װ������=============");
		System.out.println(a == b); // false,������ͬ������
		System.out.println(a); // 100,�Զ�����
		System.out.println(a == 127); // true,ֻ������������Ƚϵ�ʱ��Ż����������
		a  = 127; // �����и�����صĸ���
		System.out.println(a == b); // false,�������ڴ治ͬ
		// a = Integer.valueOf(100); , ������-128 ~ 127֮��,Ĭ�ϵ����������
		// a = new Integer(128); // ���������Ǹ���Χ,Ĭ�ϵ���
		b = 127;
		System.out.println(a == b); // true
		a = 128; // ��Ϊ����-128-127�ķ�λ,���õĶ�ʱnew Integer(128)
		b = 128;
		System.out.println(a ==b); // false

	}

}
