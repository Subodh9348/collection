package com.subodh.collection;

import java.util.Stack;

public class Stack04 {

	public static void main(String[] args) {
		
		Stack<Object> stack=new Stack<>();
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("d");
		stack.push("e");
		stack.push("f");
		
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		
	}

}
