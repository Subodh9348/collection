package com.subodh.collection;

public class ArrayFunction {
	private Object[] obja=new Object[10];
	private int index=0;
	public void add(Object obj) {
		if(size()==capacity()) {
			increaseCapacity();
		}
		obja[index]=obj;
		index++;
	}
	private void increaseCapacity() {
		Object[] tempObj=new Object[capacity()*2];
		for(int i=0;i<obja.length;i++) {
			tempObj[i]=obja[i];
		}
		obja=tempObj;
	}
	public int size() {
		return index;
	}
	public int capacity() {
		return obja.length;
		}
	public void display() {
	    for (int i = 0; i < size(); i++) {
	        System.out.print(obja[i] + " ");
	    }
	    System.out.println();
	}


	public static void main(String[] args) {
		ArrayFunction af=new ArrayFunction();
		af.add("a");
		af.add("b");
		af.add(5);
		af.add(6.7);
		af.add(true);
		af.add("e");
		af.add("a");
		af.add(8);
		af.add(9);
		af.add(10);
		
		af.add(11);
		
		af.display();



	}

}
