package com;

public class List {
	static class Node{
		private int data;
		private Node next;
		private Node prev;
		public Node(int value) {
			data = value;
			next = prev = null;
		}
	}
	
	private Node head;
	private Node tail;
	private int size;
	public List() {
		head = tail = null;
		size = 0;
	}

	public boolean isEmpty() {
		return head == null && tail == null;
	}
	
	public void deleteAll() {
		head = tail = null;
		size = 0;
	}
	
	public void addFirst(int value) {
		Node newnode = new Node(value);
				if(head == null)
			head = tail = newnode;
				else {
					newnode.next = head;
						head.prev = newnode;
		
			head = newnode;
		}
		size++;
	}
	
	public void addLast(int value) {

		Node newnode = new Node(value);

		if(head == null)
			head = tail = newnode;

		else {

			newnode.prev = tail;

			tail.next = newnode;

			tail = newnode;
		}
		size++;
	}
	
	
	public void deleteFirst() {

		if(head == null)
			return;

		else if(head == tail)
			head = tail = null;

		else {

			head = head.next;
			head.prev = null;
		}
		size--;
	}
	
	public void deleteLast() {

		if(head == null)
			return;
		else if(head == tail)
			head = tail = null;
		else {
			tail = tail.prev;

			tail.next = null;
		}
		size--;
	}
	

	public void forwardDisplay() {
		Node trav = head;
		System.out.print("Forward List : ");
		while(trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}
	
	
	public int displayTail() {
		return tail.data;
	}
	
	public int size() {
		return size;
	}
}



















