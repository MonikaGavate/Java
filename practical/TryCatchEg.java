package com;

public class TryCatchEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Hello....... How are you ??");

			int a = 5 / 0; // ArthimeticException - / by zero
			System.out.println(a);

		} catch (NullPointerException e) {
			System.out.println(e);
		} finally {
			System.out.println("I am necessary.....");
		}
	}

}
