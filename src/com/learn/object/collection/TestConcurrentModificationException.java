package com.learn.object.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 不要再foreach循环里进行元素的remove/add操作
 * remove操作使用Iterator方式,若并发需要加锁
 * @author reyshaw
 */
public class TestConcurrentModificationException {
	
	public static List<String> list = new ArrayList<String>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		list.add("1");
		list.add("2");
		
		//	deleteElement("1"); // 没有问题
		// deleteElement("2"); //  java.util.ConcurrentModificationException
		
		delEle("2");
		
		System.out.println(list.size());
		
	}
	
	// 在foreach循环里删除元素
	public static void deleteElement(String value) {
		for(String str: list) { // 这其实是Iterator的语法糖
			if(value.equals(str)) {
				list.remove(str);
			}
		}
	}
	
	// 正确操作(用使用Iterator的删除方法)
	public static void delEle(String value) {
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			if(value == it.next()) {
				it.remove(); // 这个方法是Iterator自己的,不是list的
			}
		}
	}

}
