package LinkedLists;

public class LinkedList {

	static Node head; // head of the list;
	
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}

	
	
	public static void main(String[] args){
		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(5);
		head.next.next.next = new Node(7);
		head.next.next.next.next = new Node(8);
		addAtFront(9);
		addAtFront(11);
		addAtEnd(head, 13);
		insertNode(head, 14, 3);
		deleteNode(head, 3);
		System.out.println(midPoint(head));
		System.out.println(lengthLinkedList(head));
		System.out.println(compareLinkedLists(head, createLinkedList(6)));;
		printLinkedList(head);
		printLinkedList(reverseList(head));
	}
	
	// Create new LinkedList
	static Node createLinkedList(int l){
		Node head1 = new Node(1);
		head1.next = new Node(2);
		head1.next.next = new Node(5);
		head1.next.next.next = new Node(7);
		head1.next.next.next.next = new Node(8);
		head1.next.next.next.next.next = new Node(8);
		head1.next.next.next.next.next.next = new Node(8);
		head1.next.next.next.next.next.next.next = new Node(8);
		return head1;
	}
	
	// Length of a linked list
	static int lengthLinkedList(Node h){
		int count = 1;
		while(h.next != null){
			count++;
			h = h.next;
		}
		return count;
	}
	
	// Insert a node at the start of the list
	
    static void addAtFront(int newData){
    	   Node newNode = new Node(newData);
    	   
    	   newNode.next = head;
    	   head = newNode;
    	   
    }
    
    
    // Insert a node at the end
    
    static void addAtEnd(Node h,int newData){
    		Node newNode = new Node(newData);
    		while(h.next != null){
    			h = h.next;
    		}   		
    		h.next = newNode;
    }
	
    // Insert a node at a position
    
    static void insertNode(Node h, int newData, int pos){
    		Node newNode = new Node(newData);
    		int count = 0;
    		while(h.next != null){
    			count = count + 1;
    			if(count == pos){
    				Node temp = h.next;
    				h.next = newNode;
    				newNode.next = temp;
    				break;
    			}
    			h = h.next;
    		}
    	
    }
    
    // Delete a node from a given position
    static void deleteNode(Node h, int pos){
    		int count = 0;
    		while(h.next != null){
    			count = count + 1;
    			if(count == pos){
    				h.next = h.next.next;
    				break;
    			}
    			h = h.next;
    		}
    }
		
    
    // Reverse a linked list
    static Node reverseList(Node h){
    		Node curr = h;
    		Node next = null;
    		Node prev = null;
    		while(curr != null){
    			next = curr.next;
    			curr.next = prev;
    			prev = curr;
    			curr = next;
    		}
    		return prev;
    }
    
    
    // Compare two linked lists
    static String compareLinkedLists(Node h1, Node h2){
    		if(lengthLinkedList(h1) != lengthLinkedList(h2)){
    			return "false";
    		}
    		else{
    			while(h1.next != null && h2.next != null){
    				if(h1.data != h2.data){
    					return "false";
    				}
    				h1 = h1.next;
    				h2 = h2.next;
    			}
    		}
    		return "true";
    }
	
    
    // Find Midpoint of a linked list
    static int midPoint(Node h){
    		Node slow = head;
    		Node fast = head;
    		int count = 0;
    		
    		while(fast != null && fast.next != null){
    			slow = slow.next;
    			count ++;
    			fast = fast.next.next;
    		}
    		return count;
    }
    
    // Pallindrome LinkedList
//    static String isPallindrome(Node head){
//    		
//    }
	
	
	// To print a linked list
	
	static void printLinkedList(Node h){
		
		while(h != null){
			System.out.print(h.data);
			h = h.next;
		}
	}
}

