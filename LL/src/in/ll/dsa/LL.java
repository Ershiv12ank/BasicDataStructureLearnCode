package in.ll.dsa;

public class LL {
	
	private Node head ;
	private Node tail ;
	
	private int size =  0;;
	
	public  LL() {
		this.size = 0;
	}
	
	public class Node {
		private int data ;
		private Node next;
		
	private Node(int data) {
			this.data = data;
		}
		
	private Node(int data, Node next) {
		this.data = data;
		this.next = next;
	   }
	
	public void insertAtFirst(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
		
		if(tail == null) {
			tail = head;
			
		}
		size += 1;
	}
	
	
	
	}
	
	

}
