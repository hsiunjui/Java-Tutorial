package com.learn.object.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileInputStream {

	public static void main(String[] args) {
		String path = "E:\\java_workplace\\JavaTutorial\\src\\com\\learn\\object\\io\\test.txt";
//		readByte(path);
		
		readByteArray(path);
	}
	
	// ���ֽڶ�ȡ
	public static void readByte(String path) {
		try {
			@SuppressWarnings("resource")
			FileInputStream fis = new FileInputStream(path);
			int ch = 0;
			while((ch = fis.read()) != -1) { // read()��ȡһ��byte
				System.out.print((char)ch);
			}
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("�ļ�������");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void readByteArray(String path) {
		try {
			@SuppressWarnings("resource")
			FileInputStream fis = new FileInputStream(path);
			byte[] buf = new byte[10]; // ÿ�ζ�10���ֽ�
			int len; // ���ն�ȡ���صĳ���
			while((len = fis.read(buf)) != -1) { // ���ض�ȡ�ĳ���
				System.out.print(new String(buf,0,len));
			}
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("�ļ�������");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
