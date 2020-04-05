package com.learn.object.io;

import java.io.Serializable;

public class ObjectSerializable implements Serializable{
	
	private static final long serialVersionUID = 1L; // ���Բ��ӵ�

	public ObjectSerializable(String name) {
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
