package com.xinqian.common.utils;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

public class StreamUtil {
	/*
	* 方法1：批量关闭流，参数能传入无限个。(10分)
	* 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭，并且参数个数不限。
	*/
	public static void closeAll(Closeable[]...closeables){
	//TODO 实现代码
		if (closeables!=null) {
			
		}
	}
	/*
	* 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(10分)，要求方法内部调用上面第1个方法关闭流(5分)
	*/
	public static String readTextFile(InputStream src) throws IOException{
	//TODO 实现代码
		File file = new File("D:\\pic\\aaa.txt");
		
		InputStreamReader reader = new InputStreamReader(src, "utf-8");
		int read = reader.read();
		System.out.println(read);
		return "1";
	}
	/*
	* 方法3：传入文本文件对象，返回该文件内容(10分)，并且要求内部调用上面第2个方法(5分)。* 这是典型的方法重载，记住了吗？少年…
	*/
	public static String readTextFile(File txtFile) throws Exception{
	//TODO 实现代码
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(txtFile)));
		String readLine = reader.readLine();
		return readLine;
	}
	
	public static void main(String[] args) throws Exception {
		String readTextFile = readTextFile(new File("D:\\pic\\aaa.txt"));
		System.out.println(readTextFile);
	}
	


}
