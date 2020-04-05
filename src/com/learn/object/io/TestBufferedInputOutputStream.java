package com.learn.object.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBufferedInputOutputStream {
	
	public static FileInputStream fis;
	public static FileOutputStream fos;
	public static  BufferedInputStream bis;
	public static BufferedOutputStream bos;
	
	public static void main(String[] args) {
		String path = "E:\\java_workplace\\JavaTutorial\\src\\com\\learn\\object\\io\\";
//		copy(path);
		copyByBuffered(path);
	}
	
	public static void copy(String path) {
		try {
			 fis = new FileInputStream(path + "avatar.jpg");
			 fos = new FileOutputStream(path + "avatar_copy.jpg");
			 byte[] buf = new byte[1024]; // һ�ζ�1024���ֽ�
			 int len;
			 while((len = fis.read(buf)) != -1) {
				 fos.write(buf,0, len); // �߶���д
			 }
			 fis.close();
			 fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void copyByBuffered(String path) {
		try {
			 fis = new FileInputStream(path + "avatar.jpg");
			 fos = new FileOutputStream(path + "avatar_copy_buffered.jpg");
			 
			 bis = new BufferedInputStream(fis);
			 bos = new BufferedOutputStream(fos);
			 
			 byte[] buf = new byte[1024];
			 
			 int len;
			 while((len = bis.read(buf)) != -1) {
				 bos.write(buf,0, len);
			 }
			 bis.close(); // ���Զ�����flush()����
			 bos.close();
			 fis.close();
			 fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
