package com.hughe.genecity;

import java.util.ArrayList;

/*
 ���͵ĺô���
	1��������ʱ���ֵ�������ǰ���˱���ʱ
	2.��������ν��ǿ������ת��


�����ڼ����е�Ӧ��
	ArrayList<String> list = new ArrayList<String>();	true
	
	ArrayList<Object> list = new ArrayList<String>();	false
	ArrayList<Object> list = new ArrayList<Object>();	false
	
���ǵ�������ϵͳ�ļ�����
	ArrayList list = new ArrayList<String>();			true
	ArrayList<String> list = new ArrayList();			true
	
ע�⣺������û�ж�̬�ĸ���������ݱ���һ��

�Ƽ����ߵ��������Ͷ�д��һ�µ�
 */	
public class Demo1 {

	public static void main(String [] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
//		list.add(222); //���������������������͵�����
			
		//�����е�����Ԫ��ת���ɴ�д
		for (String l : list) {
			System.out.println(l.toUpperCase());
		}
	}
}
