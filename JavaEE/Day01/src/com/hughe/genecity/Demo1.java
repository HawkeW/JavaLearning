package com.hughe.genecity;

import java.util.ArrayList;

/*
 泛型的好处：
	1，把运行时出现的问题提前至了编译时
	2.避免了无谓的强制类型转换


泛型在集合中的应用
	ArrayList<String> list = new ArrayList<String>();	true
	
	ArrayList<Object> list = new ArrayList<String>();	false
	ArrayList<Object> list = new ArrayList<Object>();	false
	
考虑到了新老系统的兼容性
	ArrayList list = new ArrayList<String>();			true
	ArrayList<String> list = new ArrayList();			true
	
注意：泛型中没有多态的概念，两边数据必须一致

推荐两边的数据类型都写上一致的
 */	
public class Demo1 {

	public static void main(String [] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
//		list.add(222); //泛型限制了其他数据类型的输入
			
		//集合中的所有元素转化成大写
		for (String l : list) {
			System.out.println(l.toUpperCase());
		}
	}
}
