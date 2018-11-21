package com.hughe.genecity;
/*
泛型类：

	如：ArrayList<String>
	
	
泛型类的定义格式：
	class 类名<声明自定义的泛型>{
	
	}
 
注意的事项：
	1.在类上自定义的泛型的具体数据类型是在创建对象的时候指定的
	2.在类上自定义的泛型，如果创建类的时候没有指定数据的类型，那么默认是Object类型
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
