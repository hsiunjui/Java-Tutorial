package com.learn.object.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashMap {
	
	private static HashMap<String, Person> hashMap = new HashMap<String, Person>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("John");
		Person p2 = new Person("Steven");
		Person p3 = new Person("Lily");
		// ���
		hashMap.put("p1", p1);
		hashMap.put("p2", p2);
		
		// ����
		Set<Entry<String, Person>> set = hashMap.entrySet();
		entrySetPrint(set);
		
		// ����
		Person p = hashMap.get("p1");
		System.out.println(p.getName());
		
		// �޸�
		hashMap.put("p1", p3); // �����޸�
		System.out.println(hashMap.get("p1").getName());
		
		// ɾ��
		Person person = hashMap.remove("p1"); // ����ɾ�����Ǹ�Ԫ��
		System.out.println(person.getName());
		
		System.out.println(hashMap.size());	// 1
		
	}
	
	// ����entrySet()���Entry����
	public static void entrySetPrint(Set<Entry<String,Person>> set) {
		Iterator<Entry<String,Person>> it = set.iterator();
		while(it.hasNext()) {
			Entry<String, Person> entry = it.next();
			System.out.print("key:" + entry.getKey() + ", value:" + entry.getValue());
		}
	}
}
