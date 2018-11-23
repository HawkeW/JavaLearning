package com.hughe.junit;

import java.util.Arrays;

import org.junit.Test;

/*
junit(单元测试框架)  工具类 jar包，导入包+set classpath——>new folder——>lib，放入junit并buildpath

目前存在的问题：
	1.目前的方法如果需要测试，都需要在main方法上调用
	2.目前的结果多需要我们人工对比
	
Junit要注意的细节
	1.使用Junit方法进行测试的时候如果是绿条，则测试正确；
		如果是出现了红条，则代表该方法测试出现了异常，不通过					
	2.Junit测试小细节：如果点击方法名、类名、包名、工程名运行junit分别测试的是对应的方法，类、包中的所有类的测试方法
	3.@Test测试的方法不能使static修饰的——报错 initializationError.也不能带有形参
		实际工程过程，可以新建一个类调用方法并@Test
		
		@Test
		public void testGetMax(int a, int b){
			
		}
	4.如果测试一个方法的时候需要准备测试环境或清理测试的环境，那么可以
		使用@Before/@After/@BeforeClass/@AfterClass这四个注解
		@Before/@After在每个测试方法测试时都会调用一次
		@BeforeClass/@AfterClass是所有的测试方法测试之前和之后共一次


Junit使用规范
	1.一个类如果需要测试，那么该类就应该对应一个测试类，测试类的命名规范：被测试类名+Test.
	2.一个被测试的方法一般对应着一个测试的方法，测试方法的命名规范：test+被测试方法
	*规范使用较复杂，实际运用过程中 一般还是在工具类头上加@Test，使用后要删除
 */
public class Junit_Demo1 {
	
	
}
