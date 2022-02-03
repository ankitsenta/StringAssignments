package com.stringAssignments;

import java.util.Scanner;

public class ChangeCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		// String str="HelloWorld";
		System.out.println("strings before replace cases");
		System.out.println(str);
		StringBuffer str1 = new StringBuffer(str);

		for (int i = 0; i < str.length(); ++i) {
			if (Character.isUpperCase(str.charAt(i))) {
				str1.setCharAt(i, Character.toLowerCase(str.charAt(i)));// replace upper case to lower case
			} else if (Character.isLowerCase(str.charAt(i))) {
				str1.setCharAt(i, Character.toUpperCase(str.charAt(i)));// replace lower case to upper case
			}

		}
		System.out.println("strings after replace cases");
		System.out.println(str1);
		sc.close();
	}
}
