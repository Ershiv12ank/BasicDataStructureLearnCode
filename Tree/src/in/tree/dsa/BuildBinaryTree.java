package in.tree.dsa;
import java.util.*;

public class BuildBinaryTree {
    static class Node {
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int ind = -1;

        public static Node buildTree(int nodes[]) {
            ind++;
            if (nodes[ind] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[ind]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }
    
    public static void Preorder(Node root) {
    	if(root == null) {
    		return;
    	}
    	System.out.print(root.data + " ,");
    	Preorder(root.left);
    	Preorder(root.right);
    }
    
    public static void inOrder(Node root) {
    	if(root == null) {
    		return;
    	}
    	
    	inOrder(root.left);
    	System.out.print(root.data + " ,");
    	inOrder(root.right);
    }
    
    public static void postOrder(Node root) {
    	if(root == null) {
    		return;
    	}
    	
    	postOrder(root.left);	
    	postOrder(root.right);
    	System.out.print(root.data + " ,");
    	
    }
    
    public static void levelOrder(Node root) {
    if(root == null) {
    	return;
    }
    	Queue<Node> q = new LinkedList<>();
    	q.add(root);
    	q.add(null);
    	
    	while(!q.isEmpty()) {
    		Node currNode = q.remove();
    		
    		if(currNode == null) {
    			
    			System.out.println();
    			if(q.isEmpty()) {
    				break;
    			} else {
    				q.add(null);
    			}
    		}
    		else {
    			System.out.print(currNode.data + " ");
    			if(currNode.left != null) {
    				q.add(currNode.left);
    				
    			}
    			if(currNode.right != null) {
    				q.add(currNode.right);
    			}
    		}
    		}
    	
    	
    }
    public static int CountOfNodes(Node root) {
		if(root == null) {
			return 0;
		}
		
		int leftNode = CountOfNodes(root.left);
		int rightNode = CountOfNodes(root.right);
		
		return leftNode + rightNode + 1;
	}
    
    public static int sumOfNodes(Node root) {
		if(root == null) {
			return 0;
		}
		
		int leftsum = sumOfNodes(root.left);
		int rightsum = sumOfNodes(root.right);
		
		return leftsum + rightsum + root.data;
	}
    
    public static int maxHeight(Node root) {
    	if(root == null) {
    		return 0;
    	}
    	
    	int leftHeight = maxHeight(root.left);
    	int rightHeight = maxHeight(root.right);
    	
    	int myHeight = Math.max(leftHeight, rightHeight);
    	
    	return myHeight;
    }
    
    	


    

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        System.out.println("\nPreorder:");
        Preorder(root);
        System.out.println("\nInorder:");
        inOrder(root);
        System.out.println("\nPostOrder");
        postOrder(root);
        System.out.println("\nLevelOrder");
        levelOrder(root);
        
        int count = CountOfNodes(root);
        System.out.println("Total number of node present: " + count);
        
        int sumOfnode = sumOfNodes(root);
        System.out.println("sum of node present: " + sumOfnode);
    }
}
