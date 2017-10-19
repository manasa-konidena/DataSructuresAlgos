package Trees;

public class BinaryTree {
	
	Node root;
	
	public void addNode(int newKey){
		
		Node newNode = new Node(newKey);
		
		if(root == null){
			root = newNode;
		} else {
			
			Node focusNode = root;	
			Node parentNode;
			while(true){
				parentNode = focusNode;
				if(newKey <= focusNode.key){
					focusNode = focusNode.leftChild;
					if(focusNode == null){
						parentNode.leftChild = newNode;
						return;
					}	
				} else {
					focusNode = focusNode.rightChild;
					if(focusNode == null){
						parentNode.rightChild = newNode;
						return;
					} 
				}
				
			}
		}
		
	}

}

class Node{
	int key;
	Node leftChild;
	Node rightChild;
	
	Node(int k) {
		this.key = k;
	}
	
}
