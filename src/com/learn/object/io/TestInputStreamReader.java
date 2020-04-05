package com.learn.object.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * �ֽ������ַ�����ת��
 * @author reyshaw
 *
 */
public class TestInputStreamReader {

	public static void main(String[] args) {
		String path = "E:\\java_workplace\\JavaTutorial\\src\\com\\learn\\object\\io\\test.txt";
		
		//	readByte(path);
		
		// readByteArray(path);
		
		readAndWrite(path);
	}
	
	// ���ַ���ȡ
	public static void readByte(String path) {
		try {
			@SuppressWarnings("resource")
			FileInputStream fis = new FileInputStream(path);
			InputStreamReader isr = new InputStreamReader(fis); // ����TestFileInputStream,����һ��
			int ch = 0;
			while((ch = isr.read()) != -1) { // read()��ȡһ��byte
				System.out.print((char)ch);
			}
			isr.close();
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("�ļ�������");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// �ַ������
	public static void readByteArray(String path) {
		try {
			@SuppressWarnings("resource")
			FileInputStream fis = new FileInputStream(path);
			InputStreamReader isr = new InputStreamReader(fis); // ...
			
			char[] buf = new char[10]; // ������char��
			int len;
			while((len = isr.read(buf)) != -1) {
				System.out.print(new String(buf,0,len));
			}
			isr.close();
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("�ļ�������");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// �߶���д
	public static void readAndWrite(String path) {
		try {
			@SuppressWarnings("resource")
			FileInputStream fis = new FileInputStream(path); // ������ģ����·����, �ַ���Ҳ��FileReader
			InputStreamReader isr = new InputStreamReader(fis, "GBK"); // ����ָ������
			BufferedReader br = new BufferedReader(isr);
			String str = path.replaceAll("test.txt", "test1.txt");
			FileOutputStream fos = new FileOutputStream(str); // FileWriter...
			OutputStreamWriter osw = new OutputStreamWriter(fos, "GBK"); // ��д����Ҫһ��
			BufferedWriter bw = new BufferedWriter(osw);
			
			char[] buf = new char[1024];
			int len;
			while((len = br.read(buf)) != -1) {
				bw.write(buf, 0, len);
			}
			bw.close();
			br.close();
			osw.close();
			fos.close();
			isr.close();
			fis.close();
			System.out.println("��д�ɹ�!");
		} catch (FileNotFoundException e) {
			System.out.println("�ļ�������");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
