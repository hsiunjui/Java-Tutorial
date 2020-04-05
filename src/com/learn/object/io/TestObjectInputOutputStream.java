package com.learn.object.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestObjectInputOutputStream {

	public static void main(String[] args) {

		ObjectSerializable os = new ObjectSerializable("test"); // 实例化
		
		String path = "E:\\java_workplace\\JavaTutorial\\src\\com\\learn\\object\\io\\obj.txt";
		
		try {
			// 向文件等介质中写
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(os); // 直接写对象
			oos.flush(); // 可有可无,但还是习惯性调以下
			oos.close();
			fos.close();
			
			// 从介质中读
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			ObjectSerializable s = (ObjectSerializable)ois.readObject(); // 读写顺序要一致
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
