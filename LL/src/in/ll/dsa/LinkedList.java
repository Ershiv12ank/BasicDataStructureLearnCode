
	
	package in.ll.dsa;

	public class LinkedList {

	    // Convert array to linked list
	    public Node convertArr2LL(int[] arr) {
	        if (arr.length == 0) return null;

	        Node head = new Node(arr[0]);
	        Node mover = head;

	        for (int i = 1; i < arr.length; i++) {  // start from 1
	            Node temp = new Node(arr[i]);
	            mover.next = temp;
	            mover = temp;
	        }

	        return head;
	    }

	    // Traverse linked list and print
	    public void printList(Node head) {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " -> ");
	            temp = temp.next;
	        }
	        System.out.println("null");
	    }
	    
	    public int LengthOfLL(Node head) {
	    	Node temp = head;
	    	int count = 0;
	    	while(temp != null) {
	    		temp = temp.next;
	    		count++;
	    	}
	    	return count;
	    }
	    
	    public Node DelitionHead(Node head) {
	    	if (head == null ) return null;
	    	head = head.next;
	    	return head;
	    }
	    
	    public Node DelitionFromLast(Node head) {
	    	if(head.next == null || head.next.next == null) return null;
	    	Node temp = head;
	    	while(temp.next.next != null) {
	    		temp = temp.next;
	    	}
	    	temp.next = null;
	    		return head;	
	    }
	    
	    public Node RemoveFromInd(Node head , int k) {
	    	if (head == null) return head;
	    	if(k == 1) {
	    		head = head.next;
	    		return head;
	    	}
	    	int cnt = 0;
	    	Node temp = head;
	    	Node prev = null;
	    	while(temp != null) {
	    		cnt++;
	 
	    		if(cnt == k) {
	    			prev.next = prev.next.next;
	    			break;
	    		}
	    		prev = temp;
	    		temp = temp.next;
	    		
	    	}
	    	return head;
	    }
	    
	    public Node insertHead(Node head,int val) {
	    	return new Node(val, head);
	    }
	    
	    public Node InsertedLast(Node head, int val) {
	    	if (head == null) {
	    		return new Node(val);
	    	}
	    	Node temp = head;
	    	Node newNode = new Node(val);
	    	while(temp.next != null) {
	    		temp = temp.next;
	    	}
	    	
	    	temp.next = newNode;
	    	return head;
	    }
	    
	    public Node InsertionFromK(Node head, int val , int k) {
	    	if(head == null) {
	    		if(k == 1) {
	    			return new Node(val);
	    		}
	    		else {
	    			return null;
	    		}
	    	}
	    	if(k==1) {
	    		return new Node(val,head);
	    	}
	    	int cunt = 0;
	    	Node temp = head;
	    	while(temp.next != null) {
	    		cunt++;
	    		if (k == (cunt-1)) {
	    			Node nd = new Node(val, temp.next);
	    			temp.next = nd;
	    			break;
	    		}
	    		temp = temp.next;
	    	}
	    	return head;
	    }
	    
	    public Node  insertAftervalue(Node head, int val_per , int val) {
	    	if(head == null) return null;
	    	if(head.data == val_per) return new Node(val, head);
	    	
	    	Node temp = head;
	    	
	    	while(temp.next != null) {
	    		if(temp.next.data == val_per) {
	    			Node n1 = new Node(val , temp.next);
	    			temp.next = n1;
	    			break;
	    			
	    		}

	    		temp = temp.next;
	    		
	    	}
	    	return head;
	    }
	}



