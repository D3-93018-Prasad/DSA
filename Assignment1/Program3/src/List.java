




class LList{
	static class Node{
		private int data;
		private Node next;
		
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	
	private Node head = null;
	
	public void addNode(int value) {
		Node newnode = new Node(value);
		
		if(head == null) {
			head = newnode;
		}
		else {
		
		newnode.next = head;
		head = newnode;
		}
		
	}
	
	public void insertAfter(int temp, int value) {
		Node newnode = new Node(value);
		
		if(head == null) {
			head = newnode;
		}
		else {
			Node trav = head;
			while( trav.next !=null && trav.data != temp ) {
				trav = trav.next;
			}
			if(trav.next == null)  return; 
			newnode.next = trav.next;
			trav.next = newnode;
		}
	}
	
	
	public void  insertBefore(int temp,  int value) {
		Node newnode = new Node(value);
		
		if(head == null) {
			head = newnode;
		}
		else {
			Node trav = head;
			while(trav.next != null && trav.next.data != temp) {
				trav = trav.next;
			}
			
			if(trav.next == null)  return; 
			newnode.next = trav.next;
			trav.next = newnode;
		}
		

	}
	
	
	public void display(){
		Node trav = head;
		System.out.println("List : ");
		while(trav != null) {
			System.out.print(trav.data + " ");
			trav = trav.next;
		}
	}
	
}

public class List {
	
	public static void main(String args[]) {
		LList l1 = new LList();
		
		l1.addNode(8);
		l1.addNode(44);
		l1.addNode(38);
		l1.addNode(55);
		l1.addNode(12);
		
		l1.display(); 
		
//		l1.insertAfter(44, 15);
//		
//		l1.insertAfter(8, 333);
		
		l1.insertBefore(398, 700);
		l1.insertAfter(398, 800);
		System.out.println(" ");
		l1.display(); 

	}
	
}
