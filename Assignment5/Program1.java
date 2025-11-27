package com;


public class Program1 {
	static class Node{
		private int data;
		private Node left;
		private Node right;
		
		public Node(int val) {
			data = val;
			left = null;
			right = null;
		}
	}
	
	private Node root;
	
	public Program1() {
		root = null;
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	public void deleteall() {
		root = null;
	}
	
	
	public void addNode(int val) {
		
		Node newnode = new Node(val);
		
		if(isEmpty()) {
			root = newnode;
			return;
		}
		
		Node trav = root;
		
		while(true) {
			if(trav.data < val) {
				if(trav.right == null) {
					trav.right = newnode;
					break;
				}
				else {
					trav = trav.right ;
				}
			}
			else {
				if(trav.left == null) {
					trav.left = newnode;
					break;
				}
				else {
					trav = trav.left;
				}
			}
		}
		
	
		
	}
	
	private void preOrder() {
		System.out.print("Preorder Traversal : ");
		preorder(root);
		System.out.println("");
	}
	
	private void preorder(Node trav) {
		if(trav == null) return;
		
		System.out.print(" " + trav.data);
		preorder(trav.left);
		preorder(trav.right);
	}
	
	private Node binarySearch(Node trav, int key) {
		if(trav == null) return null; 
		if(trav.data == key) return trav;
		else if(trav.data < key) {
			return binarySearch(trav.right, key);
		}
		else {
			return binarySearch(trav.left, key);
		}
	}
	
	private Node BinarySearch(int key) {
		return binarySearch(root, key);
	}
	
	
	public static void main(String[] args) {

		Program1 bst = new Program1();
		
		bst.addNode(8);
		bst.addNode(3);
		bst.addNode(10);
		bst.addNode(2);
		bst.addNode(15);
		bst.addNode(6);
		bst.addNode(14);
		bst.addNode(4);
		bst.addNode(7);
		
		bst.preOrder();
		
		Node ser = bst.BinarySearch(15);
		System.out.println("Value found : " + ser.data);
	}

}
