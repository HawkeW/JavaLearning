package com.hughe.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

/*
IO������⣺�豸���豸֮������ݴ������⡣���磺Ӳ��--->�ڴ�	�ڴ�--->Ӳ��

�ֽ�����

�����ֽ�����
--------|InputStream ���������ֽ����Ļ��ۡ�������
----------|FileInputStream ��ȡ�ļ��������ֽ���
----------|BufferedInputStream ���������ֽ����������ڲ���ʵ��ά����һ��8kb�ֽ��������

����ֽ�����
--------|OutputStream ��������ֽ����Ļ��ࡣ������
----------|FileOutputStream ���ļ�������� ������ֽ���
----------|BufferedOutputStream ��������ֽ�����������ֵ�Ŀ����Ϊ��������ļ�д���ݵ�Ч�ʣ������ڲ���ʵҲ��ά����һ��8kb���ֽ��������

ʲô���ʹ���ֽ�������ȡ�����ݲ���Ҫ����������߽���������ʹ���ֽ��������磺ͼƬ����

�ַ���=�ֽ���+���루���룩

�ַ�����

�����ַ�����
---------|Reader ���������ַ����Ļ��࣬������
-----------| FileReader ��ȡ�ļ��ַ��������ַ���
-----------| BufferedReader ���������ַ�����������ֵ�Ŀ����Ϊ����߶�ȡ�ļ��ַ���Ч�ʲ�����չ�˹��ܣ�readLine()�������ڲ���ʵ��Ϊ����һ��8192�����ȵ��ַ�����

����ַ�����
---------|Writer ��������ַ����Ļ��ࡣ������
-----------| FileWriter ���ļ�����ַ����ݵ�����ַ���
-----------| BufferedWriter ��������ַ�����������ֵ�Ŀ����Ϊ����߶�ȡ�ļ��ַ���Ч�ʲ�����չ�˹��ܣ�newLine()��

ʲô��������ַ�������д�Ķ����ַ����ݣ���ʱ�����Ǿ�ʹ���ַ���


ת������(Socket�õĶ�)

--�����ֽ�����ת����	�����ֽ���---->�����ַ���
	InputStreamReader
	
--�����ֽ�����ת����
	OutputStreamWriter

ת����������
	1. ���԰Ѷ�Ӧ���ֽ���ת�����ַ���ʹ�á�
	2. ����ָ�������ж�д�ļ�������
	
	
FileReader,FileWriter��������Ĭ��ʱʹ�õ���gbk���룬����ָ������д�ļ�����

 */
public class Demo1_IO {
	public static void main(String [] args) throws IOException {
//		testInput();
		writeFile();
		readFile();
	}
	
	public static void readFile() throws IOException {
		//�����ļ������ݵ���������ͨ��
		FileInputStream fileInputStream = new FileInputStream("F:\\a.txt");
		//���������ֽ�����ת��������ָ�������ж�ȡ
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"utf-8");
		
		int content = 0;
		while ((content = inputStreamReader.read())!=-1) {
			System.out.print((char)content);
		}
		//�ر���Դ
		inputStreamReader.close();
		
		/*FileReader fileReader = new FileReader("F:\\a.txt");//Ĭ��ʹ�õ���GBK�������utf-8������Ϊ����
		int content = 0;
		while ((content = fileReader.read())!= -1) {
			System.out.print((char) content);
		}
		
		//�ر���Դ
		fileReader.close();*/
	}
	
	
	
	//ָ��ʹ��utf-8��������д�����ļ���
	public static void writeFile() throws IOException {
		//�������ļ�����������ͨ��
		FileOutputStream fileOutputStream = new FileOutputStream("F:\\a.txt");
		//����һ������ֽ�����ת��������ָ�������ж�д����
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream,"utf-8");
		
		outputStreamWriter.write("��Һ�");//������utf-8�����ռ3���ַ�
		
		//�ر���Դ
		outputStreamWriter.close();
	}
	
	
	
	
	
	
	public static void testOutput() throws IOException {
		Socket socket = new Socket(InetAddress.getLocalHost(),9090);
		//��ȡ��Socket�����������
		OutputStream outputStream = socket.getOutputStream();
		
//		String str = "�����";
//		outputStream.write(str.getBytes());
		//������ֽ���ת��������ַ���
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
		outputStreamWriter.write("����");
	}
	
	
	public static void testInput() throws IOException {
		//��ȡ����̨����
		InputStream in = System.in;//"��׼"����������ȡ������Ϊ�ֽ���
//		int content = in.read();//ÿ��ֻ�����һ���ֽڵ�����,��ֻ��BufferedReader��Readline�ж�ȡһ�У��ַ������Ĺ���
		//���ǣ�BufferReader�����е�����Ϊ�ַ���
		//��Ҫ���ֽ���ת�����ַ���ʹ��
		InputStreamReader inputStreamReader = new InputStreamReader(in);//Reader���࣬�ַ���
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		System.out.println(bufferedReader.readLine());
	}
}
