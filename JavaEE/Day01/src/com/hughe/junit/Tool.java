package com.hughe.junit;

import java.util.Arrays;

import org.junit.Test;

public class Tool {
	
	
	public static int getMax() {
		int a = 3;
		int b = 5;
		int max = a>b?a:b;
		return max;
		
	}
	
	public static int getMin() {
		int a = 3;
		int b = 5;
		int min = a>b?b:a;
		return min;
		
	}
	
	@Test
	public void sort() {
		
		int[] arr = {12,4,1,19};	
		for (int i= 0; i < arr.length-1 ; i++) {
			for (int j = i+1; j < arr.length ; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("数组的元素"+Arrays.toString(arr));
	}
}
