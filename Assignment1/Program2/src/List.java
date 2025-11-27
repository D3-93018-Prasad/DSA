

class List3{
	static class Node{
		private int data;
		private Node next;
		
		public Node(int value) {
			data = value;
			next = null;
		}
		
	}
	
	private Node tail = null;
	
	public void Display() {
		if(tail == null) return;
		Node trav = tail;
		
		do {
			System.out.print(trav.data + ", ");
			trav = trav.next;
		}
		while(trav != tail);
		System.out.println(" ");
	}
	
	public void insertBegin(int value) {
		Node newnode = new Node(value);
		
		if(tail == null) 		
			tail = newnode;
		
		else {
			newnode.next = tail.next;
			tail.next = newnode;
			tail = newnode;
		}
		
	}
	
	public void insertEnd(int value) {
	Node newnode = new Node(value);
		newnode.next = tail.next;
		tail.next = newnode;
		tail = newnode;
	}
	
	public void deleteBegin() {
		if(tail == null) {
			return;
		}
		else if(tail == tail.next) {
			tail = null;
		}else {
			tail.next = tail.next.next;
		}
	}
	
	public void deleteEnd() {
		if(tail == null) return ;
		
		else if(tail.next == tail) {
			tail = null;
		}else {
			Node trav = tail;
			while(trav.next != tail) trav = trav.next;
			trav.next = tail.next;
			tail = trav;
		}
	}
	
	
}



public class List {

	public static void main(String[] args) {

		List3 l1 = new List3();
		
		l1.insertBegin(1);
		l1.insertBegin(2);
		l1.insertBegin(3);
		l1.insertEnd(4);
		l1.insertEnd(6);
		
		l1.Display();

	}

}
