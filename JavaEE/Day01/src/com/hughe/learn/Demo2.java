/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hughe.learn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author Administrator
 */
public class Demo2{
	public static void main (String [] args){
		ArrayList<String> list = new ArrayList<String>();
		//使用get方法遍历
		list.add("张三");
		list.add("李四");
		list.add("王五");

		System.out.println("\r\n=====get方式遍历=====");
		for(int i = 0; i <list.size(); i++){
			System.out.print(list.get(i)+",");
		}

		//使用迭代器，迭代器在遍历的过程中不能使用集合对象(add)修改集合中的元素个数，如果需要修改，要使用迭代器方法修改
		System.out.println("\r\n=====迭代器方式遍历=====");
		HashSet<String> set = new HashSet<String>();
		set.add("赵八");
		set.add("钱一");
		set.add("孙六");
		
		/*Iterator<String> it = set.interator();
		while (it.hasNext()){
			System.out.print(it.next());
		}
		*/
		for(String item : set){
			System.out.print(item+",");
		}
		
		System.out.println("\r\n=====迭代器方式遍历=====");
		HashMap<String, String>  map = new HashMap<String,String>();
		map.put("张三","001");
		map.put("李四","002");
		map.put("王五","003");
		Set<Entry<String,String>> entrys = map.entrySet();
		for (Entry<String,String> entry : entrys){
			System.out.print("键："+entry.getKey()+" 值："+entry.getValue());
		}
	}
}
