package com.subodh.collection;

import java.util.LinkedHashSet;

/*
 * It is used for storing only unique Objects in insertion order.
 */
public class LinkedHashSet02 {

	public static void main(String[] args) {
		
		LinkedHashSet<Object> lhs=new LinkedHashSet<>();
		System.out.println(lhs.size());
		System.out.println(lhs);
		System.out.println(".............");
		
		lhs.add("a");lhs.add("a");
		
		
		lhs.add("b");lhs.add("b");
		
		lhs.add(5);
		lhs.add(6.7);
		lhs.add(true);
		lhs.add(null);
		lhs.add(97);
		lhs.add(98);
		lhs.add("5");
		
		lhs.add(new Ex(5,6));//lhs.add(new Ex(5,6));
		
		Ex e3=new Ex(7,8);
		
		lhs.add(e3);lhs.add(e3);
		
		lhs.add(new String("a"));
		lhs.add(new Integer(5));
		
		
		System.out.println(lhs.size());
		System.out.println(lhs);
		System.out.println(".............");

	}

}
