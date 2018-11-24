package com.hughe.introspector;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
/*
�Ժ����ǿ�����ܵ�ʱ�򣬾�����Ҫ��һЩ���ݷ�װ����������ȥ
 
 */


/*
���󣺱�дһ���������������������ļ������ݣ������������ض�Ӧ�Ķ����ҰѶ�������Է���
 */
public class Demo1 {
	public static void main(String[] args) throws Exception {
		Person p = (Person) getInstance();
		System.out.println(p);
	}

	//����Ϊ���䲿��
	///���������ļ����������ɶ�Ӧ�Ķ�����Ҫ�Ѷ��������ֵ��װ��������
	public static Object getInstance() throws Exception {
		BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Github\\JavaLearning\\JavaLearning\\JavaEE\\Day01\\src\\obj.txt"));
		String className = bufferedReader.readLine();//��ȡ�����ļ���ȡ������������
		Class clazz = Class.forName(className);
		//ͨ��class��ż���ȡ���޲εĹ��췽��
		Constructor constructor = clazz.getConstructor(null);
		//��������
		Object o = constructor.newInstance(null);
		//��ȡ����ֵ
		String line = null;
		while ((line = bufferedReader.readLine())!=null) {
			String[] datas = line.split("=");
			//ͨ����������ȡ����Ӧ��Filed����
			Field field = clazz.getDeclaredField(datas[0]);
			if(field.getType()==int.class) {
				field.set(o, Integer.parseInt(datas[1]));
			}else {
				field.set(o,datas[1]);
			}
		}
		return 0;
	}
}
