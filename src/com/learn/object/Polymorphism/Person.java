package com.learn.object.Polymorphism;
/**
 * ��̬ʾ��
 * @author reyshaw
 * �ܽ᣺
 * 1.������̳й�ϵ�͸�������ָ���������
 * 2.�����Զ�תΪ�����
 *		2.1 ֻ����д�˸��෽���ķ�����Ч,��������Ľ����ܵ���
 *		2.2 ��̬����ʵ����ָ�����(Ҳ���Ǿ�̬����������д������,��ʵ�Ѿ���д)
 * 3.��ǿ��ת��ǰ,����instanceof�ж�������,��Ȼ���ܻ�����ʱ�쳣
 */
public class Person {
	private String name; //�˵Ĺ�������

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void walk() { // �˹��еķ���
		System.out.println("Person walk");
	}
	
	public static void say() {
		System.out.println("person say... staticly");
	}
}
