package in.ll.dsa;

public class Main {
    public static void main(String[] args) {
        int[] arr = {12, 45, 6, 73};

        LinkedList list = new LinkedList();   // create LinkedList object
        Node head = list.convertArr2LL(arr);  // convert array to LL

        System.out.println("Head Node: " + head.data); // print head
        list.printList(head);  // print full linked list
        
        //System.out.println("Length of Linkedlist:-" + list.LengthOfLL(head));
        
//        Node temp = list.DelitionHead(head);
//        
//        System.out.println("Head Node: " + temp.data); 
//        list.printList(temp);  
        
//        Node temp1 = list.DelitionFromLast(head);
//        System.out.println("Head Node: " + temp1.data); 
//        list.printList(temp1);  
        
//        Node temp2 = list.RemoveFromInd(head,6);
//        System.out.println("Head Node: " + temp2.data); 
//        list.printList(temp2);
        
//        Node temp3 = list.insertHead(head,234);
//        System.out.println("Head Node: " + temp3.data); 
//        list.printList(temp3);
//        
//      
//        
//        Node temp4 = list.InsertedLast(head,4);
//        System.out.println("Head Node: " + temp4.data); 
//        list.printList(temp4);
        
        
        
//        Node temp5 = list.InsertionFromK(head,3,2);
//        System.out.println("Head Node: " + temp5.data); 
//        list.printList(temp5);
//        
        
        Node temp6 = list.insertAftervalue(head,6,2);
        System.out.println("Head Node: " + temp6.data); 
        list.printList(temp6);

        
    }
}
