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
	public int hashCode() { // ��дhashCode����,haCodeһ��,��������������һ��
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) { // hashCodeһ��,equalsΪtrue�������������� 
		// ����������Լ�
		if (this == obj) {
			return true;
		}
		 // ������Ŀն���
		if (obj == null) {
			return false;
		}
		// ������Ͳ�һ��
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
