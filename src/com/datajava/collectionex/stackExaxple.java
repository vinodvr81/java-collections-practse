package com.datajava.collectionex;

import java.util.Stack;

public class stackExaxple {
	Stack<Integer> sk = new Stack<>();

	public stackExaxple() {
		// TODO Auto-generated constructor stub

		this.sk.push(12);
		this.sk.push(13);
		this.sk.push(121);
		this.sk.push(103);

		System.out.println(this.sk);
		System.out.println("Stack size is :" + this.sk.size());

	}

	private void remove() {
		// TODO Auto-generated method stub

		this.sk.pop();
		this.sk.pop();
		System.out.println("After POP now the stack");
		System.out.println(this.sk);
		System.out.println("Stack size is :" + this.sk.size());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stackExaxple obj = new stackExaxple();
		// obj.remove();

	}

}
