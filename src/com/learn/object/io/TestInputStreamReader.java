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
 * 字节流与字符流的转换
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
	
	// 单字符读取
	public static void readByte(String path) {
		try {
			@SuppressWarnings("resource")
			FileInputStream fis = new FileInputStream(path);
			InputStreamReader isr = new InputStreamReader(fis); // 比起TestFileInputStream,多这一行
			int ch = 0;
			while((ch = isr.read()) != -1) { // read()读取一个byte
				System.out.print((char)ch);
			}
			isr.close();
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("文件不存在");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 字符数组读
	public static void readByteArray(String path) {
		try {
			@SuppressWarnings("resource")
			FileInputStream fis = new FileInputStream(path);
			InputStreamReader isr = new InputStreamReader(fis); // ...
			
			char[] buf = new char[10]; // 这里是char了
			int len;
			while((len = isr.read(buf)) != -1) {
				System.out.print(new String(buf,0,len));
			}
			isr.close();
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("文件不存在");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 边读边写
	public static void readAndWrite(String path) {
		try {
			@SuppressWarnings("resource")
			FileInputStream fis = new FileInputStream(path); // 这里是模拟网路传输, 字符流也有FileReader
			InputStreamReader isr = new InputStreamReader(fis, "GBK"); // 可以指定编码
			BufferedReader br = new BufferedReader(isr);
			String str = path.replaceAll("test.txt", "test1.txt");
			FileOutputStream fos = new FileOutputStream(str); // FileWriter...
			OutputStreamWriter osw = new OutputStreamWriter(fos, "GBK"); // 读写编码要一致
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
			System.out.println("读写成功!");
		} catch (FileNotFoundException e) {
			System.out.println("文件不存在");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
