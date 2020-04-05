package com.learn.object.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {

	public static void main(String[] args) {
		String path = "E:\\java_workplace\\JavaTutorial\\src\\com\\learn\\object\\io\\test.txt";		
		writeFile(path);
	}
	
	// д�ļ�
	public static void writeFile(String path) {
		try {
			 // �ļ������ڻᴴ��,�ڶ��������ǲ���ֵ,����ָ���Ƿ���׷��
			FileOutputStream fos = new FileOutputStream(path,true);
			// �����ַ�
			fos.write(65); // A
			// д�ַ���
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
