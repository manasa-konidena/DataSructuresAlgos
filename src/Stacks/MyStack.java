package Stacks;

public class MyStack {
	
	static int maxSize;
	static int top;
	static int[] stackArray;
	
	static class Stacky{
		
		Stacky(int size){
			maxSize = size;
			top = -1;
			stackArray = new int[maxSize];
		}

		static int push(int i){
			return stackArray[++top] = i;
		}
		
		static int pop(){
			return stackArray[top--];
		}
		
		static int peek(){
			return stackArray[top];
		}
		
		static boolean isEmpty(){
			return (top == -1);
		}
		
		static boolean isFull(){
			return (top == maxSize - 1);
		}
	}
	
	
	
	
	
	static void printStack(Stacky s){
		while(s.isEmpty() == false){
			System.out.println(s.pop());
		}
	}
	
	static int maxOfStack(Stacky s1){
		int max = 0;
		while(s1.isEmpty() == false){
			int p = s1.pop();
			if(max < p){
				max = p;
			}
		}
		return max;
	}
	
	public static void main(String[] args){
		Stacky s1 = new Stacky(10);
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		s1.push(5);

		
		//System.out.println(s1.peek());
		System.out.println(maxOfStack(s1));
		
		printStack(s1);
		
	}
	
}
