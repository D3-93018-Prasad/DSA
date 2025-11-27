package com;

import java.util.ArrayDeque;


public class Program1 {
	
	public static void main(String args[]) {
	    ArrayDeque<Integer> st = new ArrayDeque<>();
	    int arr []= {10,20,30,40,50};
	    System.out.print("Before array : ");

	    
	    for(int i : arr) {
	    	System.out.print(i + ", ");
	    	st.push(i);
	    }
	    int i = 0;
	    while(!st.isEmpty()) {
	    	arr[i] = st.peek();
	    	st.pop();
	    	i++;
	    }
	    System.out.print("After Reverse : ");
	    
	    for(int j : arr) {
	    	System.out.print(j + ", ");
	    }
	}
    
    

}
