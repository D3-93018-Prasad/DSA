package com;

import com.Program1.Node;

public class Program2 {
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
	
	public Program2() {
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
	
	private void successor() {
		Node trav = root;
		if(trav.right == null && trav.left == null) {
			System.out.println("leaf node - No successor");
		}else {
			Node temp = trav.right;
			while(temp.left != null) {
				temp = temp.left;
			}
			System.out.println("Successor is "+temp.data);
		}
			
		
	}
	
	
	public static void main(String[] args) {

		Program2 bst = new Program2();
		
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
		
		bst.successor();
		
	}

}
