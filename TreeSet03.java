package com.subodh.collection;

import java.util.TreeSet;

/*
 * Tree Set is used for storing objects Sorting order [ASC or DESC]
 * it allows only Comparable homogenous object.
 * 
 * If we pass Heterogenous object 		->throws Class Cast Exception
 * If we pass null				  		->throws Null Pointer Exception
 * If we pass Non-comparable objects	->Throws Class Cast Exception
 * 
 * We can store non-comaprable objects with custom comparator implementation
 * 
 * Conclusion:
 * 	In Tree Set we can store only comparable objects or with custom comaparator
 */

public class TreeSet03 {

	public static void main(String[] args) {
		
		TreeSet<Object> ts1=new TreeSet<>();
		ts1.add("a");
		ts1.add("c");
		ts1.add("b");
		System.out.println(ts1);
		
		//ts1.add(5);		//RE:Class Cast Exception
		//ts1.add(null); //RE:Null Pointer Exception
		
		TreeSet<Integer> ts2=new TreeSet<>();
		ts2.add(5);
		ts2.add(7);
		ts2.add(6);
		System.out.println(ts2);
		
		TreeSet<Ex> ts3=new TreeSet<>(); 	//default sorting order 
		ts3.add(new Ex(5,9));				//given in Ex class with comparable
		ts3.add(new Ex(7,2));				//interface that is X property ASE order
		ts3.add(new Ex(6,3));
		System.out.println(ts3);
		
		TreeSet<Ex> ts4=new TreeSet<>((e1,e2)->e2.getX()-e1.getX());
											//for sorting object in different order
		ts4.add(new Ex(5,9));				//we must take compatator interface 
		ts4.add(new Ex(7,2));				//Comaparator is a FI,we can implement
		ts4.add(new Ex(6,3));				//by using Lambda E
		System.out.println(ts3);
		
		TreeSet<Ex> ts5=new TreeSet<>((e1,e2)->e1.getX()-e2.getX());
		ts5.add(new Ex(5,3));
		ts5.add(new Ex(7,2));
		ts5.add(new Ex(6,9));
		System.out.println(ts3);

	}

}
