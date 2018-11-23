package com.hughe.junit;

import java.io.FileInputStream;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Demo2 {
	//准备测试的环境
//	@Before
	@BeforeClass
	public static void beforeRead() {
		System.out.println("准备测试环境成功");
	}
	
	//读取文件数据，然后把文件数据都处理
	//测试之前需要准备环境（a.txt），运行完需要清理环境（删除）
	@Test
	public void readFile() throws IOException {
		FileInputStream fileInputStream = new FileInputStream("F:\\a.txt");
		int content = fileInputStream.read();
		System.out.println("内容："+content);
		
	}
	
	/*
	//读取文件中的数据，然后对文件中的数据进行排序
	public void sortContent() throws IOException {
		beforeRead();//如果不使用@After 和@Before，就需要调用方法，干扰了业务逻辑
		FileInputStream fileInputStream = new FileInputStream("F:\\a.txt");
		int content = fileInputStream.read();
		System.out.println("内容："+content);
		
		afterRead();
		
	}
	*/
	@Test
	public void sort() {
		System.out.println("文件内容排序");
	}
	
	//清理测试的环境
//	@After  如果有多个测试类，before和after会调用两次
	@AfterClass
	public static void afterRead() {
		System.out.println("清理测试环境");
	}
	
}
