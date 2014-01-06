package com.fly.thinking.one;

public class Arrays {
	
	public static void main(String[] args){
		
		int[] a1= {1,2,3,4,5};
		int[] a2;
		a2 = a1;
		for(int i=0;i<a2.length;i++){
			a2[i]++;
		}
		for(int j=0;j<a1.length;j++)
			System.out.print(a1[j] + "  ");
	}

}
