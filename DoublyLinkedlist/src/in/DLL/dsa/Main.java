package in.DLL.dsa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedListOpertaion op = new DoublyLinkedListOpertaion();
        int arr[] = {1, 5, 7, 12, 15};

        Node head = op.creatrArrLinkedlist(arr);
        op.print(head);
        
//        Node temp1 = op.deleteHead(head);
//        op.print(temp1);
		
//        Node temp2 = op.deleteTail(head);
//        op.print(temp2);
        
        Node temp2 = op.deleteKele(head , 2);
        op.print(temp2);

		

	}

}
