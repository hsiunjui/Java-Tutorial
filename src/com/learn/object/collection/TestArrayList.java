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
		// 添加
		list.add(p1);
		list.add(p2);
		
		// 查找
		Person person = list.get(0); // 越界限会出现IndexOutOfBoundsException
		System.out.println(person.getName()); // Jack
		
		// 修改
		list.set(1, p3); // 设置
		System.out.println(list.get(1).getName()); // Lily
		person.setName("John");
		System.out.println(person.getName()); // John
		
		// 删除(在增强型for循环(类似foreach)遍历时,不要对元素进行删除,可能报ConcurrentModificationException
		list.remove(person);
		System.out.println(list.size()); // 1
		System.out.println(list.contains(person)); // false
		
	}
}
