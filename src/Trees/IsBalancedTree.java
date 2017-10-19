package Trees;
import java.util.*;

public class IsBalancedTree {
	
	public static void main(String[] args){
		BinaryTree newTree = new BinaryTree();
		
		Node root = new Node(5);
		root.leftChild = new Node(10);
		root.rightChild = new Node(15);
		root.leftChild.leftChild = new Node(20);
		root.leftChild.rightChild = new Node(25);
		root.rightChild.leftChild = new Node(30);
		root.rightChild.rightChild = new Node(35);		
		root.rightChild.rightChild.rightChild = new Node (40);
		root.rightChild.rightChild.rightChild.rightChild = new Node (45);
		
		
		System.out.println(isBalanced(root));
	}
	
	public static boolean isBalanced(Node root){
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		q.add(null);
		int minHt = 10000000;
		int curHt = -1;
		int maxHt = -1;
		while(!q.isEmpty()){
			
			Node curNode = q.peek();
			q.remove();
			if(curNode == null){
				if(!q.isEmpty()){
					q.add(null);		
				}
				curHt++;
				
			} else {
				if(curNode.leftChild != null)
					q.add(curNode.leftChild);
				if(curNode.rightChild != null)
					q.add(curNode.rightChild);
				if(curNode.leftChild == null && curNode.rightChild == null){
					System.out.println("cur" + curHt);
					minHt = Math.min(minHt, curHt);
					maxHt = Math.max(maxHt, curHt);
					System.out.println("min" + minHt);
					System.out.println("max" + maxHt);
					if(maxHt - minHt > 1)
						return false;
				}
				
			}
	
		}
		return true;
	}

}
