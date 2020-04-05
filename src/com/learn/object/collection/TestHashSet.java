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
		
		/*** 添加  ****/
		set.add(p1);
		// 如果没有重写hashCode和equals方法,则会被添加进去
		set.add(p2); // 这里会返回false,但是并不会报错
		set.add(p3);
		System.out.println(set.size());
		
		/** 查找 **/
		// 查找name是Jack的Person
		Person jack = findPerson("Jack");
		if (null != jack) {
			// System.out.println(jack.hashCode()); // 2300958
			System.out.println("find:" + jack.getName());
		} else {
			System.out.println("Did not find this person");
		}
		
		/** 修改(假设该成员存在) **/
		jack.setName("John"); // hashCode已经改变(因为name属性参与了hashCode运算),
		// System.out.println(jack.hashCode()); // 2314570

		/*** 删除 **/
		boolean isRemoved = false;
		// 方式一
//		Person john = findPerson( "Steven");
//		boolean isRemoved = set.remove(john); // 这个方法是可以的,因为hashCode值是一样的
		
		// set.remove(jack); // false,因为hashCode值发生了变化,删除是靠hashCode值来找的
		
		// 方式二
		isRemoved = deleteElement("John"); // 推荐的的操作
		
		System.out.println("isRemoved: " + isRemoved);
		
		// 输出set
		printSet();
		
	}
	// 删除(不可以使用foreach删除)
	public static boolean deleteElement(String name) {
		Iterator<Person> it = set.iterator();
		while(it.hasNext()) {
			if(name.equals(it.next().getName())) {
				it.remove(); // 这个是Iterator的remove方法
				return true;
			}
		}
		return false;
	}
	
	// 遍历打印set成员
	public static void printSet() {
		Iterator<Person> it = set.iterator();
		while(it.hasNext()) {
			Person person = it.next();
			System.out.println(person);
		}
	}
	
	// 查找
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

