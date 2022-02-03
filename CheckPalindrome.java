package com.stringAssignments;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int i = 0;
		boolean flag = true;
		if (str.charAt(i) != str.charAt(str.length() - i - 1))//check character if its not equal
			
		{
			flag = false;
			System.out.println("String is not a palindrome");
		}
		if (flag) {

			System.out.println("String is a palindrome");
		}
sc.close();
	}

}
