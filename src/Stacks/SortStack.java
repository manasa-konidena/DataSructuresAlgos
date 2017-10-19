package Stacks;

import java.util.Stack;

public class SortStack extends MyStack{

	public static void main(String[] args){
		Stacky s1 = new Stacky(10);
		
		s1.push(4);
		s1.push(9);
		s1.push(2);
		s1.push(10);
		s1.push(3);
		s1.push(11);
		s1.push(1);
		

		
		sortAscendingOrder(s1);
			
	}
	
	public static void sortAscendingOrder(Stacky s){
		
		Stack<Integer> s2 = new Stack<>();

		
		while(!s.isEmpty()){
			int temp1 = s.pop();
			if(s2.isEmpty()){
				s2.push(temp1);
			}
			else{
				while(temp1 < s2.peek()){
					s.push(s2.pop());
				}
				s2.push(temp1);
			}
		}
		
		while(!s2.isEmpty()){
			System.out.print(s2.pop()+" ");
		}
	}
	
	
	
}
