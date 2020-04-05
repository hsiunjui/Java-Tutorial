package com.learn.object.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestObjectInputOutputStream {

	public static void main(String[] args) {

		ObjectSerializable os = new ObjectSerializable("test"); // ʵ����
		
		String path = "E:\\java_workplace\\JavaTutorial\\src\\com\\learn\\object\\io\\obj.txt";
		
		try {
			// ���ļ��Ƚ�����д
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(os); // ֱ��д����
			oos.flush(); // ���п���,������ϰ���Ե�����
			oos.close();
			fos.close();
			
			// �ӽ����ж�
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			ObjectSerializable s = (ObjectSerializable)ois.readObject(); // ��д˳��Ҫһ��
			System.out.println(s.getName()); // test
			ois.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
