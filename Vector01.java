package com.subodh.collection;

import java.util.Vector;

/**
 * 	About vector:
 * =================
 * 1.Vector is a legacy collection. It is available form java 1.0v.
 * In java 1.2v it is added as implementation class of list interface.
 *
 * 2.We must use choose vector ,for storing multiple objects in insertion order wtih index in multithread application with thread safety.
 * 
 * 3.Vector is synchronized, it is best in Multi thread application and not good in Single Thread Application.
 * 
 * 4.Vector is a ordered collection,it maintains insertion order.
 * 
 * 5.It is implemented data structure is 'growlable array'.
 * 
 * 6.Default capacity: 10, incremental capacity:+1 or double.
 * 
 * 7.All 4 types of objects are allowed :Homogenous,Heterogenous,Unique and Duplicate.
 * 
 * 8.Null is allowed,multiple nulls are allowed.
 * 
 * 9.It stores objects in insertion order.
 * 
 * 10.It allows us to retrieve elements either randomly or sequentially.
 * 
 * 11.In search and remove operations in contains() and remove() method internally equals() method
 * 	  is called, it is executed our class that search argument object class.
 * 
 * 12.Available constructors:
 * 		1.Vector()
 * 		2.Vector(Collection c)
 * 		3.Vector(int capacity)
 * 		4.Vector(int capacity,int incremental capacity).
 * 
 */
public class Vector01 {

	public static void main(String[] args) {
		
		Vector<Object> v1=new Vector<>();
		System.out.println("Capacity:"+v1.capacity());
		System.out.println("Size :"+v1.size());
		System.out.println("Elements"+v1);
		System.out.println("..............................");
		
		v1.add("a");
		v1.add("b");
		v1.add(5);
		v1.add(6.7);
		v1.add('a');
		v1.add(true);
		v1.add(null);
		v1.add(new Ex(5,6));
		v1.add("a");
		v1.add(5);
		
		System.out.println("Elements"+v1);
		System.out.println("Size :"+v1.size());
		System.out.println("Capacity:"+v1.capacity());
		System.out.println(".........................");
		
		v1.add(null);
		v1.add(new Ex(5,6));
		v1.add(new Ex(7,8));
		v1.add(6.7);
		
		System.out.println("Elements"+v1);
		System.out.println("Size :"+v1.size());
		System.out.println("Capacity:"+v1.capacity());
		
		//Random Access
		System.out.println(v1.get(4));
		System.out.println(v1.get(10));
		
		//sequential Access
		for(int i=0;i<v1.size();i++) {
			System.out.println(v1.get(i)+" ");
		}
		System.out.println("...................");
		for(Object obj:v1) {
			System.out.println(obj+" ");
		}
		
		System.out.println("...................");
		v1.forEach(obj->System.out.println(obj+" "));
		
		System.out.println("...................");
		v1.stream().forEach(obj->System.out.println(obj+" "));
	}

}


























