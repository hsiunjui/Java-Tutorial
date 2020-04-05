package com.learn.object.collection;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListRemove {
	
	public static List<String> list = new ArrayList<String>();
	
	public static void main(String[] args) {
		list.add("0");
		list.add("1");
		list.add("2");
		list.add("3");
		
		System.out.println("Original List: " + list);
		removeFromZero();
//		removeFromLast();
		System.out.println("Removed List: " + list);
		
	}
	
	/**
	 * 向上遍历,结果是正确的
	 * 但是i:2, ele:2这行没有
	 */
	public static void removeFromZero() {
		String temp = null;
		for(int i = 0; i < list.size(); i++) { // 如果把int size = list.size();放在外部则会越界
			temp = list.get(i);
			System.out.println("list:"+ list + ", i: " + i + ", ele:" + temp);
			if("1".equals(temp)) {
				list.remove(temp);
			}
		}
	}
	
	/**
	 * 向下遍历,结果也正确,过程也完整打印了(还可以使用一个新的list来放过滤后的数据,但是要占用空间)
	 */
	public static void removeFromLast() {
		String temp = null;
		int i = list.size()-1; // 这里可以放出来
		for(; i >= 0; i--) {
			temp = list.get(i);
			System.out.println("list:"+ list + ", i: " + i + ", ele:" + temp);
			if("2".equals(temp)) {
				list.remove(temp);
			}
		}
	}
}
