package com;
import java.util.*;

public class BST {
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
	
	public BST() {
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
		
		
		//create new node = val
		// ifEmpty root = newnode
		
		//else
			// create trav node for traversal;
			//start while(true)
				// find the right position 
				// if(trav.data < val) 
					// check if right exists, if not then insert there
					//else 
						// trav = trav.right;
				//else
					// check if left exists, if not then insert there
					// else 
						// trav  = trav.left;
		
	}
	
	public int getLevel(int key) {
	    Node trav = root;
	    int level = 0;

	    while (trav != null) {
	        if (trav.data == key)
	            return level;
	        else if (key < trav.data)
	            trav = trav.left;
	        else
	            trav = trav.right;
	        level++;
	    }

	    // if not found
	    return -1;
	}
	
	public void delete(int val){
		// find val in BST 
		// 3 cases :
		// 	1. leaf node
		// 	2. single child node
		// 	3. 2 child nodes
		
		Node trav = root, parent = null;
		while(trav != null) {
			if(trav.data == val) break;
			
			parent = trav;
			if(trav.data < val) trav = trav.right;
			else trav = trav.left;
		}
		if(trav == null) return;

		// now we need to delete trav
		// case 3. 2 child nodes
		if(trav.left != null && trav.right != null) {
			// Find Pred
			Node pred = trav.left ;
			while(pred.right != null) {
				parent = pred;
				pred = pred.right;
			}
			trav.data = pred.data;
//			parent.right = null;
			trav = pred;
		}
		
		//case 2. single child
		if(trav.left == null) {
			if(trav == root) root = trav.right;
			else if(trav == parent.left) {
				parent.left = trav.right;
			}else if(trav == parent.right) {
				parent.right = trav.right;
			}
		}
		
		else {	//if(trav.right == null) {
			if(trav == root)
				root = trav.left;
			else if(trav == parent.left)
				parent.left = trav.left;
			else if(trav == parent.right)
				parent.right = trav.left;
		}		
		
	}
	
	public void preOrder() {
		System.out.print("Preorder Traversal : ");
		preorder(root);
		System.out.println("");
	}
	
	
	public void preorder(Node trav) {
		if(trav == null) return;
		
		System.out.print(" " + trav.data);
		preorder(trav.left);
		preorder(trav.right);
	}
	
	private void postOrder() {
		System.out.print("Postorder Traversal : ");
		postorder(root);
		System.out.println("");
	}
	
	
	private void postorder(Node trav) {
		if(trav == null) return;
		
		preorder(trav.left);
		preorder(trav.right);
		System.out.print(" " + trav.data);
	}
	
	private void inOrder() {
		System.out.print("Inorder Traversal : ");
		inorder(root);
		System.out.println("");
	}
	
	
	private void inorder(Node trav) {
		if(trav == null) return;
		
		preorder(trav.left);
		System.out.print(" " + trav.data);
		preorder(trav.right);
	}
	
	
	public Node binarySearch(int key) {
		Node trav = root;
		while(trav != null) {
			if(trav.data == key) 
				return trav;
			else if(trav.data < key) {
				trav = trav.right;
			}else {
				trav = trav.left;
			}
		}
		return null;
	}
	
	
	public void BFS() {
		
		Queue<Node> q = new LinkedList<Node>();
		q.offer(root);
		
		System.out.println("BFS [Level order Traversal] :");
		while(!q.isEmpty()) {
			Node curr = q.poll();
			System.out.print(" " + curr.data);
			if(curr.left != null) {
				q.offer(curr.left);
			}
			if(curr.right != null) {
				q.offer(curr.right);
			}
		}
		System.out.println("");
		
		
		// create a queue
		// push root into queue
		// while !q.isEmpty
			// print current
			// pop current;
			// push current.left , current.right
			
		
	}
	
	public void DFS() {
		
		Stack<Node> st = new Stack<Node>();
		st.push(root);
		
		System.out.println("DFS :");
		while(!st.isEmpty()) {
			Node curr = st.pop();
			System.out.print(" " + curr.data);
			if(curr.left != null) {
				st.push(curr.left);
			}
			if(curr.right != null) {
				st.push(curr.right);
			}
		}
		System.out.println("");
			
	}
	
	
	public int height(Node trav) {
		if(trav == null ) return -1;
		
		int hl = height(trav.left);
		int hr = height(trav.right);
		
		int max;
		if(hl > hr) max = hl;
		else max = hr;
		
		return max+1;
	}
	
	public int height() {
		return height(root);
	}
	
	public static void main(String[] args) {
		BST bst = new BST();
		
		bst.addNode(8);
		bst.addNode(3);
		bst.addNode(10);
		bst.addNode(2);
		bst.addNode(15);
		bst.addNode(6);
		bst.addNode(14);
		bst.addNode(4);
		bst.addNode(7);
		
		bst.inOrder();

		
		bst.delete(8);
		
//		bst.preOrder();
//		bst.postOrder();
		bst.inOrder();
		
//		BST.Node ret = bst.binarySearch(14);
//		if(ret == null)
//			System.out.println("key is not found");
//		else
//			System.out.println("key is found");
		
//		bst.BFS();
//		bst.DFS();
		
//		System.out.println("Height = " + bst.height());
		
	}

}
