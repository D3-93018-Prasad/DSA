package com;

import java.util.Scanner;

class Queue {
    private int SIZE;
    private int arr[];
    private int front, rear;

    public Queue(int size) {
        SIZE = size;
        arr = new int[SIZE];
        front = rear = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        if (front == -1) {  
            front = rear = 0;
        } else {
            rear++;
            if (rear == SIZE) rear = 0;   
        }

        arr[rear] = value;
        System.out.println(value + " inserted");
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println(arr[front] + " removed");

        if (front == rear) {  
            front = rear = -1;  
        } else {
            front++;
            if (front == SIZE) front = 0;  
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    public boolean isFull() {
        if (front == 0 && rear == SIZE - 1) return true;

        if (rear + 1 == front) return true;

        return false;
    }

    public boolean isEmpty() {
        return front == -1;
    }
}

public class Program2 {

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
        Queue q = new Queue(5);
        int choice;

        while ((choice = menu()) != 0) {

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    q.push(sc.nextInt());
                    break;

                case 2:
                    System.out.println("Front element: " + q.peek());
                    break;

                case 3:
                    q.pop();
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        System.out.println("Program Ended.");
    }
}
