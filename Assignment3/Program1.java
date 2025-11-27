package com;

import java.util.Scanner;
import java.util.Stack;

public class Program1 {

	public static boolean isPalindrome(String str) {
		int i = 0;
		int j = str.length()-1;
		
		while(i<j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	public static boolean isPalReverse(String str) {
	    String rev = new StringBuilder(str).reverse().toString();
	    return str.equals(rev);
	}
	
	
	public static boolean isPalRecursion(String str) {
	    return check(str, 0, str.length() - 1);
	}

	private static boolean check(String str, int left, int right) {
	    if (left >= right)
	        return true;

	    if (str.charAt(left) != str.charAt(right))
	        return false;

	    return check(str, left + 1, right - 1);
	}
	
	public static boolean isPalStack(String str) {
		Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return str.equals(reversed.toString());
	}
	

	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		String str = "RACososCAR" ;
//		boolean check = isPalindrome(str);
//		boolean check = isPalReverse(str);
//		boolean check = isPalRecursion(str);
		boolean check = isPalStack(str);

		
		System.out.print("The given string is ");
		if(check) System.out.println("Palindrome");
		else System.out.println("Not Palindrome");
		
	}
}