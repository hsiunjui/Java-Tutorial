package com.learn.object.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ��Ҫ��foreachѭ�������Ԫ�ص�remove/add����
 * remove����ʹ��Iterator��ʽ,��������Ҫ����
 * @author reyshaw
 */
public class TestConcurrentModificationException {
	
	public static List<String> list = new ArrayList<String>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		list.add("1");
		list.add("2");
		
		//	deleteElement("1"); // û������
		// deleteElement("2"); //  java.util.ConcurrentModificationException
		
		delEle("2");
		
		System.out.println(list.size());
		
	}
	
	// ��foreachѭ����ɾ��Ԫ��
	public static void deleteElement(String value) {
		for(String str: list) { // ����ʵ��Iterator���﷨��
			if(value.equals(str)) {
				list.remove(str);
			}
		}
	}
	
	// ��ȷ����(��ʹ��Iterator��ɾ������)
	public static void delEle(String value) {
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			if(value == it.next()) {
				it.remove(); // ���������Iterator�Լ���,����list��
			}
		}
	}

}
