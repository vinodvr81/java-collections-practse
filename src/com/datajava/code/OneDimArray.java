package com.datajava.code;

public class OneDimArray {
	private String[] St;

	public void setSt(String[] St) {
		this.St = St;
	}

	public String[] getSt() {
		return St;
	}

	public OneDimArray() {
		// TODO Auto-generated constructor stub

		this.setSt(new String[] { "Vinod", "Skanda" });
	}

	public static void main(String[] args) {
		OneDimArray obj = new OneDimArray();
		String[] st = obj.getSt(); // get the array

		for (int i = 0; i < st.length; i++) {
			System.out.println("Item " + i + ": " + st[i]);

		}

	}

}
