package com.learn.object.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {

	public static void main(String[] args) {
		String path = "E:\\java_workplace\\JavaTutorial\\src\\com\\learn\\object\\io\\test.txt";		
		writeFile(path);
	}
	
	// 写文件
	public static void writeFile(String path) {
		try {
			 // 文件不存在会创建,第二个参数是布尔值,可以指定是否是追加
			FileOutputStream fos = new FileOutputStream(path,true);
			// 单个字符
			fos.write(65); // A
			// 写字符串
			String str = "This is a test";
			char[] chs = str.toCharArray();
			byte[] bytes = new byte[chs.length];
			for(int i = 0;  i < chs.length; i++) {
				bytes[i] = (byte)chs[i];
			}
			fos.write(bytes);
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
