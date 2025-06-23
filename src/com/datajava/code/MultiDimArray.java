package com.datajava.code;

public class MultiDimArray {

	private int[][] arr;

	public void setArr(int[][] arr) {
		this.arr = arr;
	}

	public int[][] getArr() {
		return arr;
	}

	public MultiDimArray() {
		this.setArr(new int[][] { { 54, 65, 57 }, { 45, 76, 87 }, { 74, 76, 73 } });
	}

	public static void main(String[] args) {
		MultiDimArray obj = new MultiDimArray();
		int[][] array = obj.getArr();

		System.out.println("Printing the 2D Array:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println(); // move to next row
		}
	}
}