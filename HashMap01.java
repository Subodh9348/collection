package com.subodh.collection;

import java.util.HashMap;

/*
 * For Storing objects with mapping in hash code order We must use HashMap
 * 
 * Hash Map maintains entries in the key object's hash code order.
 */
public class HashMap01 {

	public static void main(String[] args) {
		
		HashMap<Object,Object> hm=new HashMap<>();
		System.out.println(hm.size());
		System.out.println(hm);
		System.out.println("....................");
		
		System.out.print(hm.put("a",1));		System.out.println("\t"+hm);
		System.out.print(hm.put("a",2));		System.out.println("\t"+hm);
		System.out.print(hm.put("b",3));		System.out.println("\t"+hm);
		System.out.print(hm.put(5,4));			System.out.println("\t"+hm);
		System.out.print(hm.put(6.7,5));		System.out.println("\t"+hm);
		System.out.print(hm.put('p',6));		System.out.println("\t"+hm);
		System.out.print(hm.put(true,7));		System.out.println("\t"+hm);
		System.out.print(hm.put(null,8));		System.out.println("\t"+hm);
		System.out.print(hm.put(null,9));		System.out.println("\t"+hm);
		System.out.print(hm.put(new Ex(5,6),10));System.out.println("\t"+hm);
		System.out.print(hm.put(97,11));		System.out.println("\t"+hm);
		System.out.print(hm.put(98,12));		System.out.println("\t"+hm);
		System.out.print(hm.put(99,13));		System.out.println("\t"+hm);
		System.out.print(hm.put(1,null));		System.out.println("\t"+hm);
		System.out.print(hm.put(2,null));		System.out.println("\t"+hm);
		
		System.out.println(hm.size());

	}

}
