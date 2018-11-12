package com.hughe.learn;

import java.util.ArrayList;

/*
���ϣ��洢�������ݵļ�������

���м���

----------| Collection  �������� �ĸ��ӿ�
--------------| List �����ʵ����List�ӿڵļ����࣬�߱����ص㣺���򣬿��ظ�
----------------|ArrayList ArrayList�ײ���ʹ����Object����ʵ�ֵģ��ص㣺��ѯ�ٶȿ飬��ɾ��
----------------|LinkedList LinkedList�ײ���ʹ�����������ݽṹʵ�ֵġ��ص㣺��ѯ�ٶ�������ɾ��
----------------|Vector �ײ���ʹ����Obeject����ʵ�ֵõ���ʵ��ԭ����ArrayList��һ�µģ��������̰߳�ȫ�ģ�����Ч�ʵ�
--------------| Set ��� ��������Set�ӿڵļ����࣬�߱����ص㣺���裬�����ظ���
----------------|HashSet �ײ���ʹ���˹�ϣ��ʵ�ֵģ��ص㣺��ȡ�ٶȿ� 

HashSetҪע��õ����
	1.��HashSet���Ԫ�ص�ʱ�����Ȼ����Ԫ�ص�hashCode�����õ�Ԫ�صĹ�ϣ��ֵ��
	Ȼ��ѹ�ϣ��ֵ�����������Ԫ�ش��ڹ�ϣ���е�λ�á�
	
	���1����������λ��Ŀǰ��û�д����κε�Ԫ�أ���ô��Ԫ�ؿ���ֱ����ӵ���ϣ����
	
	���2����� �����λ��Ŀǰ �Ѿ�����������Ԫ�أ���ô�������Ԫ�ص�equals���� �����λ���ϵ�Ԫ���ٱȽ�һ��
	���equals�������ص���true����ô��Ԫ����Ϊ�ظ�Ԫ�أ���������ӣ����Ϊfalse���������ӣ�
----------------|TreeSet �ײ���ʹ���˺�����������������ݽṹʵ�ֵġ��ص㣺�Լ����е�Ԫ�ؽ�������洢��

TreeSetҪע�������
	1.��TreeSet���Ԫ�ص�ʱ�����Ԫ�ؾ߱���Ȼ˳����ص㣬��ôTreeSet�����Ԫ�ص���Ȼ˳�����Խ�������洢
	2.��TreeSet���Ԫ�ص�ʱ�����Ԫ�ز��߱���Ȼ˳����ص㣬��ôԪ����������ͱ���Ҫʵ��Comparable�ӿڣ��ѱȽϵĹ�������CompareTo������
	3.��TreeSet���Ԫ�ص�ʱ�����Ԫ�ز��߱���Ȼ˳����ص㣬Ԫ����������Ҳû��ʵ��Comparable�ӿڣ���ô�ڴ���TreeSet�����ʱ�����Ҫ����Ƚ����Ķ���

�Ƚ����Ķ����ʽ��

	class ���� implements Comparator{
	}
---------------------------------------	
˫�м��ϣ�
---------------| Map �洢�����ݶ����Լ�ֵ�Ե���ʽ���ڵģ����������ظ���ֵ�����ظ���
-----------------| HashMap �ײ�ʹ���˹�ϣ��ʵ�ֵ�
-----------------| TreeMap �ײ�ʹ���˺�������ݽṹʵ�ֵ�
*/

class Person{
	int id;
	String name;
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id;
	}
	
	@Override
	public boolean equals(Object obj) {
		Person p = (Person) obj;
		return this.id == p.id;
	}

	@Override
	public String toString() {
		
		return "���"+this.id+" ������ "+this.name;
	}
	
	
	
	
	
}
public class Demo1 {
	public static void main(String [] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
//		list.add(222); //���������������������͵�����
		
		for (String l : list) {

			System.out.println(l.toUpperCase());
		}
	}
	
}
