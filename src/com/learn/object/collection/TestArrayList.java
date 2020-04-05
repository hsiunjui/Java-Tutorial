package com.learn.object.collection;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
	
	private static List<Person> list = new ArrayList<Person>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person("Jack");
		Person p2 = new Person("Steven");
		Person p3 = new Person("Lily");
		// ���
		list.add(p1);
		list.add(p2);
		
		// ����
		Person person = list.get(0); // Խ���޻����IndexOutOfBoundsException
		System.out.println(person.getName()); // Jack
		
		// �޸�
		list.set(1, p3); // ����
		System.out.println(list.get(1).getName()); // Lily
		person.setName("John");
		System.out.println(person.getName()); // John
		
		// ɾ��(����ǿ��forѭ��(����foreach)����ʱ,��Ҫ��Ԫ�ؽ���ɾ��,���ܱ�ConcurrentModificationException
		list.remove(person);
		System.out.println(list.size()); // 1
		System.out.println(list.contains(person)); // false
		
	}
}
