package com.hughe.genecity;
/*
�����ࣺ

	�磺ArrayList<String>
	
	
������Ķ����ʽ��
	class ����<�����Զ���ķ���>{
	
	}
 
ע������
	1.�������Զ���ķ��͵ľ��������������ڴ��������ʱ��ָ����
	2.�������Զ���ķ��ͣ�����������ʱ��û��ָ�����ݵ����ͣ���ôĬ����Object����
 */

class Mylist<T>{
	Object[] arr = new Object[10];
	int index = 0;
	public Mylist() {

	}
	public void add(T o) {
		arr[index++] = o;
	}
}
public class Demo3 {
	/*
	public static void main(String [] args) {
		Mylist<String> list = new Mylist<String>();
		list.add("123");
		
		Mylist list1 = new Mylist<>();
		
	}
	*/
	
}
