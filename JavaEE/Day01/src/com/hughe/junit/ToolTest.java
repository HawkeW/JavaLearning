package com.hughe.junit;

import org.junit.Test;

import junit.framework.Assert;

public class ToolTest {
	
	@Test
	public void testGetMax() {
		
		int max = new Tool().getMax();
//		if(max != 5) {
//			throw new RuntimeException();
//		}else {
//			System.out.println("���ֵ:"+max);
//		}
		
		//����
		Assert.assertSame(5, max);//Expected ����  actual ʵ��ֵ  ʵ�ʱȽϵķ���Ϊ  "=="������equals
//		Assert.assertSame(new String("abc"), "abc");//���ش���
		Assert.assertEquals(new String("abc"), "abc");//�ײ�ʹ��equals����
		Assert.assertNull(null);
		Assert.assertTrue(true);
	}
	
	@Test
	public void testGetMin() {
		
		int min = new Tool().getMin();
		if(min != 3) {
			throw new RuntimeException();
		}else {
			System.out.println("���ֵ:"+min);
		}
		
	}
}
