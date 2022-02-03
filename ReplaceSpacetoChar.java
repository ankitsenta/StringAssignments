package com.stringAssignments;

public class ReplaceSpacetoChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "      replace white space with character  ";
		System.out.println("print before white space");

		System.out.println(s);
		String s1;
		s1 = s.replaceAll(" ", "A");
		System.out.println(s1);

	}

}
