package com.hughe.genecity;
/*
�Զ��巺��:�Զ��巺�Ϳ������Ϊһ���������͵�ռλ�����������Ϊ��һ���������͵ı���

���ͷ�����
	���ͷ����Ķ����ʽ��
		
		���η�  <�����Զ��巺��> ����ֵ����	���������β��б�����{
		
		}
		
�ڷ����ϵ��Զ��巺�͵ľ������������ǵ��ø÷�������ʵ�ε�ʱ��ȷ����	
	
���󣺶���һ���������Խ����������͵ĺ�����Ҫ�����ķ���ֵ����Ҫ��ʵ�ε���������һ��
	
 */
public class Demo2 {
	public static void main(String[] args) {
		Object i = print(12);//ʵ�ʵķ���ֵ�Ƕ�������Ƕ�Ӧ����������
		Object str = print("abc");
		
		Integer i1 = printf(12);
		String str1 = printf("abc");
	}

	public static Object print(Object o) {
		return o;
	}
	//<T>��T��ĸ����Ϊ�Զ���ķ���	
	public static <T> T printf(T o) {
		return o;
	}
}
