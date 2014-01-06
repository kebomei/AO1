package com.fly.thinking.one;

import java.util.Date;
import java.util.Properties;

public class Property {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args){
		System.out.println(new Date());
		
		Properties p = System.getProperties();
		p.list(System.out);
		
		System.out.println("----user of memeory");
		Runtime rt = Runtime.getRuntime();
		System.out.println("total memory = "+ rt.totalMemory()
				+" free memory = " + rt.freeMemory());
		
		try{
			Thread.currentThread().sleep(5 * 1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}
