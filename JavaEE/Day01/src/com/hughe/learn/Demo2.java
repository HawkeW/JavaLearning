///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.hughe.learn;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Map.Entry;
//import java.util.Set;
//
///**
// *
// * @author Administrator
// */
//public class Demo2{
//	public static void main (String [] args){
//		ArrayList<String> list = new ArrayList<String>();
//		//浣跨敤get鏂规硶閬嶅巻
//		list.add("寮犱笁");
//		list.add("鏉庡洓");
//		list.add("鐜嬩簲");
//
//		System.out.println("\r\n=====get鏂瑰紡閬嶅巻=====");
//		for(int i = 0; i <list.size(); i++){
//			System.out.print(list.get(i)+",");
//		}
//
//		//浣跨敤杩唬鍣紝杩唬鍣ㄥ湪閬嶅巻鐨勮繃绋嬩腑涓嶈兘浣跨敤闆嗗悎瀵硅薄(add)淇敼闆嗗悎涓殑鍏冪礌涓暟锛屽鏋滈渶瑕佷慨鏀癸紝瑕佷娇鐢ㄨ凯浠ｅ櫒鏂规硶淇敼
//		System.out.println("\r\n=====杩唬鍣ㄦ柟寮忛亶鍘�=====");
//		HashSet<String> set = new HashSet<String>();
//		set.add("璧靛叓");
//		set.add("閽变竴");
//		set.add("瀛欏叚");
//		
//		/*Iterator<String> it = set.interator();
//		while (it.hasNext()){
//			System.out.print(it.next());
//		}
//		*/
//		for(String item : set){
//			System.out.print(item+",");
//		}
//		
//		System.out.println("\r\n=====杩唬鍣ㄦ柟寮忛亶鍘�=====");
//		HashMap<String, String>  map = new HashMap<String,String>();
//		map.put("寮犱笁","001");
//		map.put("鏉庡洓","002");
//		map.put("鐜嬩簲","003");
//		Set<Entry<String,String>> entrys = map.entrySet();
//		for (Entry<String,String> entry : entrys){
//			System.out.print("閿細"+entry.getKey()+" 鍊硷細"+entry.getValue());
//		}
//	}
//}
