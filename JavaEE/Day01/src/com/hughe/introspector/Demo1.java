package com.hughe.introspector;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
/*
以后我们开发框架的时候，经常需要把一些数据封装到对象里面去
 
 */


/*
需求：编写一个工厂方法，根据配置文件的内容，工厂方法返回对应的对象并且把对象的属性返回
 */
public class Demo1 {
	public static void main(String[] args) throws Exception {
		Person p = (Person) getInstance();
		System.out.println(p);
	}

	//以下为反射部分
	///根据配置文件的内容生成对应的对象并且要把对象的属性值封装到对象中
	public static Object getInstance() throws Exception {
		BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Github\\JavaLearning\\JavaLearning\\JavaEE\\Day01\\src\\obj.txt"));
		String className = bufferedReader.readLine();//读取配置文件获取到完整的类名
		Class clazz = Class.forName(className);
		//通过class对偶像获取到无参的构造方法
		Constructor constructor = clazz.getConstructor(null);
		//创建对象
		Object o = constructor.newInstance(null);
		//读取属性值
		String line = null;
		while ((line = bufferedReader.readLine())!=null) {
			String[] datas = line.split("=");
			//通过属性名获取到对应的Filed对象
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
