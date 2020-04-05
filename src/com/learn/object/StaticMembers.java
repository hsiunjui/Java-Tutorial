package com.learn.object;
/**
 * �Ǿ�̬���Է��ʷǾ�̬�;�̬
 * ��̬���ܷ��ʷǾ�̬
 * @author reyshaw
 *
 */
public class StaticMembers {
	public static void main(String[] args) {
		BaseClass bc = new BaseClass();
		BaseClass.printName(bc); // ���þ�̬����
		bc.printI(); // ���÷Ǿ�̬����
	}
}

/**������**/
class BaseClass {
	private int i = 10;
	private static String name = "BaseClass";
	
	 // �Ǿ�̬�������ʷǾ�̬��Ա
	public void getI() {
		System.out.println("getI() -> i:" + i); // this.i;
	}
	
	// �Ǿ�̬�������ʷǾ�̬����/��̬��Ա/��̬����
	public void printI() {
		getI(); //�Ǿ�̬�������ʷǾ�̬����
		System.out.println("printI() -> getI():");
		System.out.println("printI() -> static name:" + name); // this.name; BaseClass.name; �Ǿ�̬�������ʾ�̬��Ա
		printName(this); // this.printName(); BaseClass.printName(); �Ǿ�̬�������ʾ�̬����
		System.out.println("printI() -> static printName()");
	}
	
	// ��̬�������ʾ�̬��Ա(��̬�����ﲻ����ʹ��this!!!)
	public static void getName() {
		// i++; // x,���ܷ��ʷǾ�̬��Ա
		// getI()++; // x,���ܷ��ʷǾ�̬����
		System.out.println("static getName() -> static name:" + name); // BaseClass.name;
	}
	
	// ��̬�������ʾ�̬����
	public static void printName(BaseClass bc) {
		bc.getI(); // ��̬�������÷Ǿ�̬�����ķ���
		getName(); // BaseClass.getName(); ��̬�������ʾ�̬����
		System.out.println("static printName() -> static getName()");
	}
}
