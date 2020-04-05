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
	 * ���ϱ���,�������ȷ��
	 * ����i:2, ele:2����û��
	 */
	public static void removeFromZero() {
		String temp = null;
		for(int i = 0; i < list.size(); i++) { // �����int size = list.size();�����ⲿ���Խ��
			temp = list.get(i);
			System.out.println("list:"+ list + ", i: " + i + ", ele:" + temp);
			if("1".equals(temp)) {
				list.remove(temp);
			}
		}
	}
	
	/**
	 * ���±���,���Ҳ��ȷ,����Ҳ������ӡ��(������ʹ��һ���µ�list���Ź��˺������,����Ҫռ�ÿռ�)
	 */
	public static void removeFromLast() {
		String temp = null;
		int i = list.size()-1; // ������Էų���
		for(; i >= 0; i--) {
			temp = list.get(i);
			System.out.println("list:"+ list + ", i: " + i + ", ele:" + temp);
			if("2".equals(temp)) {
				list.remove(temp);
			}
		}
	}
}
