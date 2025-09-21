package in.DLL.dsa;

public class DoublyLinkedListOpertaion {
    
    public void print(Node head) {
        Node temp = head;
        while(temp != null) {   // fix: check temp, not temp.next
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public Node creatrArrLinkedlist(int[] arr) {
        if(arr.length == 0) return null;
        
        Node head = new Node(arr[0]);
        Node prev = head;
        
        for(int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            prev.next = temp;   // fix: connect prev -> temp
            temp.prev = prev;   // fix: connect temp -> prev
            prev = temp;
        }
        return head;
    }
    
    public Node deleteHead(Node head) {
    	if (head == null || head.next == null) {
    		return head;
    	}
    	Node prev = head;
    	head = head.next;
    	head.prev = null;
    	prev.next = null;
    	
    	return head;
    	
    }
    
    public Node deleteTail(Node head) {
    	
    	if (head == null || head.next == null) {
    		return head;
    	}
    	Node tail = head;
    	
    	while(tail.next != null) {
    		tail=tail.next;
    	}
        Node newTail = tail.prev;
        newTail.next = null;
        tail.prev = null;  
        
        return head;
    
    }
    
    public Node deleteKele(Node head, int k) {
    	if (head == null) {
    		return null;
    	}
    	Node temp = head;
    	int count = 0;
    	while(temp != null) {
    		count++;
    		if(count == k) {
    			break;
    		}
    		temp = temp.next;
    	}
    	
    	Node back = temp.prev;
    	Node upword = temp.next;
    	
    	if(temp.prev == null && temp.next == null) {
    		return null;
    	}
    	else if (temp.next == null) {
    		deleteTail(head);
    	}
    	else if(temp.prev == null) {
    		deleteHead(head);
    	}
    	
    	else {
    		back.next = upword;
    		upword.prev = back;
    		temp.next = null;
    		temp.prev = null;
    	}
    	
    	
    	return head;
    }
}
