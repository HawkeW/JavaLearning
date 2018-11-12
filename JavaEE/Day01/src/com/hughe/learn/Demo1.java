package com.hughe.learn;

import java.util.ArrayList;

/*
集合：存储对象数据的集合容器

单列集合

----------| Collection  单例集合 的根接口
--------------| List 如果是实现了List接口的集合类，具备的特点：有序，可重复
----------------|ArrayList ArrayList底层是使用了Object数组实现的，特点：查询速度块，增删慢
----------------|LinkedList LinkedList底层是使用了链表数据结构实现的。特点：查询速度慢，增删快
----------------|Vector 底层是使用了Obeject数组实现得到，实现原理与ArrayList是一致的，但是是线程安全的，操作效率低
--------------| Set 如果 是显现了Set接口的集合类，具备的特点：无需，不可重复。
----------------|HashSet 底层是使用了哈希表实现的，特点：存取速度快 

HashSet要注意得到事项：
	1.往HashSet添加元素的时候，首先会调用元素的hashCode方法得到元素的哈希码值，
	然后把哈希码值经过运算算出元素存在哈希表中的位置。
	
	情况1：如果算出的位置目前还没有存在任何的元素，那么该元素可以直接添加到哈希表中
	
	情况2：如果 算出的位置目前 已经存在其他的元素，那么还会调用元素的equals方法 再与该位置上的元素再比较一次
	如果equals方法返回的是true，那么该元素视为重复元素，不允许添加；如果为false，则可以添加；
----------------|TreeSet 底层是使用了红黑树（二叉树）数据结构实现的。特点：对集合中的元素进行排序存储。

TreeSet要注意的事项
	1.往TreeSet添加元素的时候，如果元素具备自然顺序的特点，那么TreeSet会根据元素的自然顺序特性进行排序存储
	2.往TreeSet添加元素的时候，如果元素不具备自然顺序的特点，那么元素所属的类就必须要实现Comparable接口，把比较的规则定义在CompareTo方法上
	3.往TreeSet添加元素的时候，如果元素不具备自然顺序的特点，元素所属的类也没有实现Comparable接口，那么在创建TreeSet对象的时候必须要传入比较器的对象

比较器的定义格式：

	class 类名 implements Comparator{
	}
---------------------------------------	
双列集合：
---------------| Map 存储的数据都是以键值对的形式存在的，键不可以重复，值可以重复。
-----------------| HashMap 底层使用了哈希表实现的
-----------------| TreeMap 底层使用了红黑树数据结构实现的
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
		
		return "编号"+this.id+" 姓名： "+this.name;
	}
	
	
	
	
	
}
public class Demo1 {
	public static void main(String [] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
//		list.add(222); //泛型限制了其他数据类型的输入
		
		for (String l : list) {

			System.out.println(l.toUpperCase());
		}
	}
	
}
