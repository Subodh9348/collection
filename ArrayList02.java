package com.subodh.collection;

import java.util.ArrayList;

/*
 * 	About Arraylist:
 * =================
 * 1.Arraylist is a collections framework collection. It is available form java 1.2v.
 *  It is an implementation of list .
 *
 * 2.We must  choose Arraylist ,for storing multiple objects in  Singlethread application without
 *   thread safety in insertion order index.
 * 
 * 3.ArrayList is not synchronized, it is best in Single thread application and not good in 
 * MultiThread Application.
 * 
 * 4.Arraylist is a ordered collection,it maintains insertion order.
 * 
 * 5.It is implemented data structure is 'resizable array'.
 * 
 * 6.Default capacity: 10, incremental capacity:+1 or half.
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
 * 		1.Arraylist()
 * 		2.Arraylist(Collection c)
 * 		3.Arraylist(int capacity)
 * 		
 */
public class ArrayList02 {

		public static void main(String[] args) {
			
			ArrayList<Object> a1=new ArrayList<>();
			//System.out.println("Capacity:"+v1.capacity());
			System.out.println("Size :"+a1.size());
			System.out.println("Elements"+a1);
			System.out.println("..............................");
			
			a1.add("a");
			a1.add("b");
			a1.add(5);
			a1.add(6.7);
			a1.add('a');
			a1.add(true);
			a1.add(null);
			a1.add(new Ex(5,6));
			a1.add("a");
			a1.add(5);
			
			System.out.println("Elements"+a1);
			System.out.println("Size :"+a1.size());
			//System.out.println("Capacity:"+v1.capacity());
			System.out.println(".........................");
			
			a1.add(null);
			a1.add(new Ex(5,6));
			a1.add(new Ex(7,8));
			a1.add(6.7);
			
			System.out.println("Elements"+a1);
			System.out.println("Size :"+a1.size());
			//System.out.println("Capacity:"+v1.capacity());
			
			//Random Access
			System.out.println(a1.get(4));
			System.out.println(a1.get(10));
			
			//sequential Access
			for(int i=0;i<a1.size();i++) {
				System.out.println(a1.get(i)+" ");
			}
			System.out.println("...................");
			for(Object obj:a1) {
				System.out.println(obj+" ");
			}
			
			System.out.println("...................");
			a1.forEach(obj->System.out.println(obj+" "));
			
			System.out.println("...................");
			a1.stream().forEach(obj->System.out.println(obj+" "));
		}	
}
