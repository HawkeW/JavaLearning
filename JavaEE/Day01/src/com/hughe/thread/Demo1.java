package com.hughe.thread;
/*
�̣߳�

���̵߳ĺô������߳̽������һ��������ͬʱ����ִ�ж��������������

�Զ����̵߳Ĵ�����ʽ��

	��ʽһ���̳�Thread
		1.�Զ���һ����̳�Thread��
		
		2.��дThread��run���������Զ����̵߳���������Զ�����run������
		3.����Thread����Ķ��󣬲���start��������һ���̡߳�
	
	
	
	��ʽ����ʵ��Runnable�ӿ�
		1.�Զ���һ����̳�Thread��
		2.ʵ��Runnable�ӿ��е�run���������Զ����̵߳�������붨����run������
		3.����Runnableʵ����Ķ���
		4.����Thread���󣬲��Ұ�Runnabel ʵ����Ķ�����Ϊ��������
		5.����Thread�����start���������߳�
		
�̰߳�ȫ����Ľ��������

	�̰߳�ȫ������ֵĸ���ԭ��
		1.����Ҫ�������������������ϵ��߳�  ����  ��һ����Դ
		2.����������Դ�Ĵ����������������������ϡ�
	
	
	1.ͬ�������
		
		synchronized(��){
			��Ҫ��ͬ���Ĵ���
		}
		
	2.ͬ������
		
		���η� synchronized ����ֵ���� ���������β��б�...��{
		
		}
		
	ע�⣺
		1.ͬ��������������ʹ����Ķ���ͬ�����������ǹ̶��ģ��Ǿ�̬��������������this���󣬾�̬��������������class����
		2.����������Ƕ��̹߳���Ķ��󣬷�������ס
		3.��ͬ������������ͬ�������е���Sleep�����ǲ����ͷ�������ģ����������wait�����ǻ��ͷ��������
		
 */
public class Demo1 extends Thread{

	public Demo1 (String name) {
		super(name);
	}
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+"��"+i);
		}
	}
	
	public static void main(String[] args) {
		int a = 0;
		System.out.println("a="+a++);
		
		Demo1 d = new Demo1("����");
		d.start();//�����̣߳��߳�һ�������ͻ�ָ��run�����еĴ���
		
		for(int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+"��"+i);
		}
	}
	
}
