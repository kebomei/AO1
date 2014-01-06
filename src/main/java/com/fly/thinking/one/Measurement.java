package com.fly.thinking.one;

public class Measurement {
	
	boolean t;
	char c;
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	
	public void print(){
		System.out.println("boolean t= "+ t
				+", char c = "+c
				+", byte b = "+ b
				+ ", short s = " + s
				+ ", int i = " + i
				+ ", long l = " + l
				+ ", float f = " + f
				+ ", double d = " + d);
	}
	
	public static void main(String[] args){
		
		Measurement m = new Measurement();
		m.print();
	}

}
