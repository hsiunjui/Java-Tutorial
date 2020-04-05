package com.learn.test;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		  List<String> list = new ArrayList<String>();
	        list.add("0");
	        list.add("1");
	        list.add("2");
	        list.add("3");
	        list.add("4");
	        System.out.println("Original list : " + list);

	        String temp = null;
	        for (int i = 0; i < list.size(); i++) {
	            temp = list.get(i);
	            
	            System.out.println("Check for " + temp + ", i: " + i);
	            if ("2".equals(temp)) {
	                list.remove(temp);
	            }
	        }
	        System.out.println("Removed  list : " + list);
	}
}
