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
//			System.out.println("最大值:"+max);
//		}
		
		//断言
		Assert.assertSame(5, max);//Expected 期望  actual 实际值  实际比较的方法为  "=="而不是equals
//		Assert.assertSame(new String("abc"), "abc");//返回错误
		Assert.assertEquals(new String("abc"), "abc");//底层使用equals方法
		Assert.assertNull(null);
		Assert.assertTrue(true);
	}
	
	@Test
	public void testGetMin() {
		
		int min = new Tool().getMin();
		if(min != 3) {
			throw new RuntimeException();
		}else {
			System.out.println("最大值:"+min);
		}
		
	}
}
