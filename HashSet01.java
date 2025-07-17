package com.subodh.collection;

import java.util.HashSet;

/*
 * It is used for storing only unique Objects in the Hash Code order of the adding objects.
 */
public class HashSet01 {

	public static void main(String[] args) {
		
		HashSet<Object> hs=new HashSet<>();
		System.out.println(hs.size());
		System.out.println(hs);
		System.out.println(".............");
		
		hs.add("a");
		hs.add("a");
		
		
		hs.add("b");
		hs.add("b");
		hs.add(5);
		hs.add(6.7);
		hs.add(true);
		hs.add(null);
		hs.add(97);
		hs.add(98);
		hs.add("5");
		hs.add(new Ex(5,6));
		hs.add(new Ex(5,6));
		Ex e3=new Ex(7,8);
		hs.add(e3);
		hs.add(e3);
		hs.add(new String("a"));
		hs.add(new Integer(5));
		
		
		System.out.println(hs.size());
		System.out.println(hs);
		System.out.println(".............");

	}

}

