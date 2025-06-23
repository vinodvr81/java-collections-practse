package com.datajava.code;

public class ManipulatingString {

	private String st = new String("Hello ");
	private String st1 = "Vinod Vukkalam!";

	private String extracted() {
		return this.st + this.st1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManipulatingString obj = new ManipulatingString();
		String[] arr = obj.extracted().split(" ");
		

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].trim());
			System.out.println(arr[i].contains("Vinod"));
			System.out.println(arr[i]);
			System.out.println(arr[i].compareTo("Vinod"));
			System.out.println(arr[i].length());
			if (i == 2) {
				arr[i].concat(" Rangaswamy");
				System.out.println(arr[i]);
			}
			
		}

	}
}
