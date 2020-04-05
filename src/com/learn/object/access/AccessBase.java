package com.learn.object.access;
/**
 * ���常��public/protected/default/private��Ա
 * @author reyshaw
 * �ܽ᣺
 * 1.privateֻ�����ڲ�����
 * 2.default���˰����ܷ���
 * 3.protected���˰�,������Է���
 * 4.public���κεط������Է���
 */
public class AccessBase {
	
	public int pubAttr = 1;	// ������(�κεط������Է���)
	
	protected boolean proAttr =  true; // �ܱ�����(���������ܷ���,��ͬ���������еĿ��Է���)
	
	float defAttr = 10.4f; // Ĭ�ϵ�(��ͬ��������������������ܷ���)
	
	private char priAttr = 'c'; // ˽�е�(ֻ�����ڲ�����)
	
	public AccessBase() {
		// �����Ĭ�ϵ��ø�����޲ι�����
	}
	
	// public function
	public void pubFunc() {
		System.out.println("pubFunc:" + pubAttr);
	}
	
	// protected function
	protected void proFunc() {
		System.out.println("proFunc:" + proAttr);
	}
	
	// default function
	void defFunc() {
		System.out.println("defFunc:" + defAttr);
	}
	
	// private function
	private void priFunc() {
		System.out.println("priFunc:" + priAttr);
	}
	
	// overwrite toString
	@Override
	public String toString() {
		priFunc(); // Ϊ��ȥ����33�еľ���
		return "";
	}
}
