package com.hughe.junit;

import java.io.FileInputStream;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Demo2 {
	//׼�����ԵĻ���
//	@Before
	@BeforeClass
	public static void beforeRead() {
		System.out.println("׼�����Ի����ɹ�");
	}
	
	//��ȡ�ļ����ݣ�Ȼ����ļ����ݶ�����
	//����֮ǰ��Ҫ׼��������a.txt������������Ҫ��������ɾ����
	@Test
	public void readFile() throws IOException {
		FileInputStream fileInputStream = new FileInputStream("F:\\a.txt");
		int content = fileInputStream.read();
		System.out.println("���ݣ�"+content);
		
	}
	
	/*
	//��ȡ�ļ��е����ݣ�Ȼ����ļ��е����ݽ�������
	public void sortContent() throws IOException {
		beforeRead();//�����ʹ��@After ��@Before������Ҫ���÷�����������ҵ���߼�
		FileInputStream fileInputStream = new FileInputStream("F:\\a.txt");
		int content = fileInputStream.read();
		System.out.println("���ݣ�"+content);
		
		afterRead();
		
	}
	*/
	@Test
	public void sort() {
		System.out.println("�ļ���������");
	}
	
	//������ԵĻ���
//	@After  ����ж�������࣬before��after���������
	@AfterClass
	public static void afterRead() {
		System.out.println("������Ի���");
	}
	
}
