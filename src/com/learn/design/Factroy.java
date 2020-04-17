package com.learn.design;
/**
 * 
 * @author reyshaw
 * ����ԭ��(��չ����,�޸Ĺر�)
 * ������ԭ��(����İ����˵��)
 */
public class Factroy {
	public static O createObject(String name) {
		O o = null;
		// �򵥹���,�������������������һ��������
		if(name.equals("A")) {
			o = new A();
		} else if(name.equals("B")) {
			o = new B();
		}
		return o;
	}
	
	// ���÷���
	@SuppressWarnings("deprecation")
	public static O createByForName(String name) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		return (O)Class.forName(name).newInstance();
	}
}

// ����ͳһ��׼
interface O {
	public void go();
}

// ���������Ĺ��̱Ƚϸ���,������ٲ�ֳɵ�������,�ܹ��������ü򵥹�����������Ĺ���
class A implements O {
	public void go() {
		System.out.println("A is going...");
	}
}

class B implements O {
	public void go() {
		System.out.println("B is going...");
	}
}