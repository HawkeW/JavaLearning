package com.hughe.genecity;
/*
自定义泛型:自定义泛型可以理解为一个数据类型的占位符，或者理解为是一个数据类型的变量

泛型方法：
	泛型方法的定义格式：
		
		修饰符  <声明自定义泛型> 返回值类型	函数名（形参列表。。）{
		
		}
		
在方法上的自定义泛型的具体数据类型是调用该方法传入实参的时候确定的	
	
需求：定义一个函数可以接收任意类型的函数，要求函数的返回值类型要和实参的数据类型一致
	
 */
public class Demo2 {
	public static void main(String[] args) {
		Object i = print(12);//实际的返回值是对象而不是对应的数据类型
		Object str = print("abc");
		
		Integer i1 = printf(12);
		String str1 = printf("abc");
	}

	public static Object print(Object o) {
		return o;
	}
	//<T>把T字母声明为自定义的泛型	
	public static <T> T printf(T o) {
		return o;
	}
}
