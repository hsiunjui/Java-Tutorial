package com.learn.object.Polymorphism.test;

import com.learn.object.Polymorphism.Person;
import com.learn.object.Polymorphism.Student;
import com.learn.object.Polymorphism.Teacher;

public class TestPerson {
	public static void main(String[] arg) {
		// ����ת��(�Զ�)
		Person teacher = new Teacher();
		teacher.walk();
		// teacher.teach();  // X,��ΪPerson�ಢû�и÷���,��ʱֻ�ܰ�Teacher����Person
		Teacher.say(); // ���ø����say����,�������Լ���!!!!
		
		// ����ת��(ǿ��)
		Teacher t = (Teacher)teacher;
		if (teacher instanceof Teacher) { // �ж�����,instanceof�������ϼ���
			t.teach(); // ��������
		}
		Teacher.say(); // ��������Լ���say����
		
		/** ������������ͬ����֮��ǿת ***/ 
		Person student = new Student();
		// t = (Teacher)student; // �������ʱ�쳣,����ת��
		student.walk();
	}
}
