package com.stringAssignments;

public class RemoveWhitespace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "      remove white space  ";
		System.out.println("print before white space");

		System.out.println(s);
		String s1;
		s1 = s.replaceAll(" ", "");
		System.out.println(s1);

	}

}
