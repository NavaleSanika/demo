package com.demo;

public class Test {
	public static void main(String[] args) {
		int x[][]= {{1,2},{2,3}};
		int[][] y= {{10,20},{20,30}};
		int z[][]= {{100,200},{200,300}};
		int []a[]= {{1000,2000},{2000,3000}};
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
		
		System.out.println(x[0][0]);
		System.out.println(y[0][0]);
		System.out.println(z[0][0]);
		System.out.println(a[0][0]);
	
	int[][] arr=new int[2][2];
	arr[0][0]=105;
	arr[0][1]=102;
	arr[1][0]=103;
	arr[1][1]=104;
	
	System.out.println(arr[0][0]);
	System.out.println(arr[0][1]);
	System.out.println(arr[1][0]);
	System.out.println(arr[1][1]);
	}

}

