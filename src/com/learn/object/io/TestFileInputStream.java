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
	
	// 单字节读取
	public static void readByte(String path) {
		try {
			@SuppressWarnings("resource")
			FileInputStream fis = new FileInputStream(path);
			int ch = 0;
			while((ch = fis.read()) != -1) { // read()读取一个byte
				System.out.print((char)ch);
			}
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("文件不存在");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void readByteArray(String path) {
		try {
			@SuppressWarnings("resource")
			FileInputStream fis = new FileInputStream(path);
			byte[] buf = new byte[10]; // 每次读10个字节
			int len; // 接收读取返回的长度
			while((len = fis.read(buf)) != -1) { // 返回读取的长度
				System.out.print(new String(buf,0,len));
			}
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("文件不存在");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
