package com;

import java.util.Scanner;

import com.List.Node;

class stack {
	private int SIZE;
	private Node top ;
	private int cnt;
	List l1 = new List();

	
	public stack(int size){
		SIZE = size;
		int cnt = 0;
	}
	
	
	public void push(int value) {
		if(cnt == SIZE) {
			System.out.println("Stack is full");
			return;
		}
		cnt++;
		l1.addLast(value); 
	}
	
	public void pop(){
		if(cnt == 0) {
			System.out.println("Stack is Empty");
			return;
		}
		cnt--;
		l1.deleteLast();
	}
	
	public int peek() {
		return l1.displayTail();
	}
	
	
}
public class Program3 {

	 private static Scanner sc = new Scanner(System.in);

	    public static int menu() {
	        System.out.println("\n-------------- Operations -----------");
	        System.out.println("1. Push");
	        System.out.println("2. Peek");
	        System.out.println("3. Pop");
	        System.out.println("0. Exit");
	        System.out.print("Enter your choice: ");
	        return sc.nextInt();
	    }

	    public static void main(String[] args) {
	    	stack st = new stack(5);
	        int choice;

	        while ((choice = menu()) != 0) {

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter value: ");
	                    st.push(sc.nextInt());
	                    break;

	                case 2:
	                    System.out.println("Front element: " + st.peek());
	                    break;

	                case 3:
	                    st.pop();
	                    break;

	                default:
	                    System.out.println("Invalid choice!");
	            }
	        }

	        System.out.println("Program Ended.");
	    }

}
