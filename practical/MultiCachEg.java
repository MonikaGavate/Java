package com;

public class MultiCachEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int arr[] = new int[6];
			arr[5] = 5 / 1;
			System.out.println(arr[5]);
			String s = null;
			s.length();

		}
	catch (ArithmeticException e) {
		System.out.println(e);
		}

		catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
     	}

	catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Hello");
	}
	}


