package com.hughe.introspector;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

import org.junit.Test;


/*
��ʡ����>һ����̬�ķ���

��ʡ��������⣺��Ҫ�ǰѶ�������� ���� ��װ��������
 */
public class Demo2_intro {
	
	@Test
	public void getAll() throws Exception {
		//Introspector ��ʡ��
		BeanInfo beanInfo = Introspector.getBeanInfo(Person.class);
		//ͨ��BeanInfo��ȡ���е���������
		PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
		for (PropertyDescriptor p : descriptors) {
			System.out.println(p.getReadMethod());//get����
		}
	}
	
	public static void main(String[] args) {
		
	}
	
	@Test
	public void testProperty() throws Exception {
		Person p = new Person();
		//����������
		PropertyDescriptor descriptor = new PropertyDescriptor("id",Person.class);
		//��ȡ���Զ�Ӧ��get������set�������û��߻�ȡ����
		Method m = descriptor.getWriteMethod();
		//ִ�и÷�����������ֵ
		m.invoke(p, 110);
		
		Method readMethod = descriptor.getReadMethod();
		
		System.out.println(p);
		
	}
}
