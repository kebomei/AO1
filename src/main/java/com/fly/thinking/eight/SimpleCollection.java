package com.fly.thinking.eight;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SimpleCollection {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		for(int i = 0; i < 10; i++)
		c.add(new Integer(i));
		Iterator it = c.iterator();
		while(it.hasNext())
		System.out.println(it.next());
		}
}
