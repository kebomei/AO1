package com.fly.thinking.one;

public class Cupboard {
	
	Bowl b3 = new Bowl(3);
	
	static Bowl b4 = new Bowl(4);
	
	public Cupboard(){
		System.out.println("Cupboard()");
		b4.f(2);
	}
	
	public void f3(int marker){
		System.out.println("f3(" + marker + ")");
	}

	static Bowl b5 = new Bowl(5);
}
