package in.dsa.tree;
class Node {
	Node left;
	Node right;
	int data;
	
	public Node(int data) {
		this.data = data;
	}
	
	public void PreOrder(Node root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data + "->");
		PreOrder(root.left);
		PreOrder(root.right);
	}
	public void InOrder(Node root) {
		if(root == null) {
			return ;
		}
		InOrder(root.left);
		System.out.print(root.data + "->");
		InOrder(root.right);
	}
	
	public void PostOrder(Node root) {
		if(root == null) {
			return ;
		}
		
		PostOrder(root.left);
		PostOrder(root.right);
		System.out.print(root.data + "->");
	}
	
}

public class Tree {
	public static void main(String[] args) {
		Node root = new Node(6);
		Node n1 = new Node(7);
		Node n2 = new Node(9);
		Node n3 = new Node(5);
		Node n4 = new Node(2);
		Node n5 = new Node(1);
		
		root.left = n1;
		root.left.left = n2;
		root.left.right = n3;
		root.right = n4;
		root.right.left = n5;
		
		root.PreOrder(root);
		System.out.println();
		root.InOrder(root);
		System.out.println();
		root.PostOrder(root);
		
		
		
	}

}
