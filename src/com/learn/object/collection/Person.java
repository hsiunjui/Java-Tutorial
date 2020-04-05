package com.learn.object.collection;

public class Person {
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() { // 重写hashCode方法,haCode一样,不代表两个对象一样
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) { // hashCode一致,equals为true则两个对象才相等 
		// 如果传的是自己
		if (this == obj) {
			return true;
		}
		 // 如果传的空对象
		if (obj == null) {
			return false;
		}
		// 如果类型不一致
		if (getClass() != obj.getClass()) {
			return false;
		}
			
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "My name is: " + this.getName();
	}
}
