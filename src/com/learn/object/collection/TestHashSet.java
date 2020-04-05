package com.learn.object.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet {
	
	public static Set<Person> set = new HashSet<Person>();
	
	public static void main(String[] args) {
		
		Person p1 = new Person("Jack");
		Person p2 = new Person("Jack");
		Person p3 = new Person("Steven");
		
		/*** ���  ****/
		set.add(p1);
		// ���û����дhashCode��equals����,��ᱻ��ӽ�ȥ
		set.add(p2); // ����᷵��false,���ǲ����ᱨ��
		set.add(p3);
		System.out.println(set.size());
		
		/** ���� **/
		// ����name��Jack��Person
		Person jack = findPerson("Jack");
		if (null != jack) {
			// System.out.println(jack.hashCode()); // 2300958
			System.out.println("find:" + jack.getName());
		} else {
			System.out.println("Did not find this person");
		}
		
		/** �޸�(����ó�Ա����) **/
		jack.setName("John"); // hashCode�Ѿ��ı�(��Ϊname���Բ�����hashCode����),
		// System.out.println(jack.hashCode()); // 2314570

		/*** ɾ�� **/
		boolean isRemoved = false;
		// ��ʽһ
//		Person john = findPerson( "Steven");
//		boolean isRemoved = set.remove(john); // ��������ǿ��Ե�,��ΪhashCodeֵ��һ����
		
		// set.remove(jack); // false,��ΪhashCodeֵ�����˱仯,ɾ���ǿ�hashCodeֵ���ҵ�
		
		// ��ʽ��
		isRemoved = deleteElement("John"); // �Ƽ��ĵĲ���
		
		System.out.println("isRemoved: " + isRemoved);
		
		// ���set
		printSet();
		
	}
	// ɾ��(������ʹ��foreachɾ��)
	public static boolean deleteElement(String name) {
		Iterator<Person> it = set.iterator();
		while(it.hasNext()) {
			if(name.equals(it.next().getName())) {
				it.remove(); // �����Iterator��remove����
				return true;
			}
		}
		return false;
	}
	
	// ������ӡset��Ա
	public static void printSet() {
		Iterator<Person> it = set.iterator();
		while(it.hasNext()) {
			Person person = it.next();
			System.out.println(person);
		}
	}
	
	// ����
	public static Person findPerson(String name) {
		Iterator<Person> it = set.iterator();
		while(it.hasNext()) {
			Person person = it.next();
			if(name ==person.getName()) {
				return person;
			}
		}
		return null;
	}
}

