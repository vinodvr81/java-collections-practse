package com.datajava.code;

public class BufferStringEx {
	
	private StringBuffer buf;
	
	public void setBuf(StringBuffer buf) {
		this.buf = buf;
	}
	
	public StringBuffer getBuf() {
		return buf;
	}

	public void BufferStringEx() {
		// TODO Auto-generated constructor stub
		this.setBuf(new StringBuffer("Hello Vinod Vukkalam! "));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferStringEx obj = new BufferStringEx();
		obj.BufferStringEx();
		System.out.println(obj.buf);
		System.out.println(obj.buf.capacity());
		obj.buf.append("Rangaswamy");
		System.out.println(obj.buf);
		System.out.println(obj.buf.capacity());
		
	}

}
