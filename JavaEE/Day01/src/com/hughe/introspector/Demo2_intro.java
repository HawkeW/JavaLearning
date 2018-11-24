package com.hughe.introspector;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

import org.junit.Test;


/*
内省——>一个变态的反射

内省解决的问题：主要是把对象的属性 数据 封装到对象中
 */
public class Demo2_intro {
	
	@Test
	public void getAll() throws Exception {
		//Introspector 内省类
		BeanInfo beanInfo = Introspector.getBeanInfo(Person.class);
		//通过BeanInfo获取所有的属性描述
		PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
		for (PropertyDescriptor p : descriptors) {
			System.out.println(p.getReadMethod());//get方法
		}
	}
	
	public static void main(String[] args) {
		
	}
	
	@Test
	public void testProperty() throws Exception {
		Person p = new Person();
		//属性描述器
		PropertyDescriptor descriptor = new PropertyDescriptor("id",Person.class);
		//获取属性对应的get或者是set方法设置或者获取属性
		Method m = descriptor.getWriteMethod();
		//执行该方法设置属性值
		m.invoke(p, 110);
		
		Method readMethod = descriptor.getReadMethod();
		
		System.out.println(p);
		
	}
}
