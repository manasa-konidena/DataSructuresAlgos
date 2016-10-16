package Stacks;

public class MyStack {
	static int maxSize;
	static int top;
	static long[] stackArray;
	
	
	public MyStack(int size){
		maxSize = size;
		top = -1;
		stackArray = new long[maxSize];
	}
	
	static long push(long i){
		return stackArray[++top] = i;
	}
	
	static long pop(){
		return stackArray[top--];
	}
	
	static long peek(){
		return stackArray[top];
	}
	
	static boolean isEmpty(){
		return (top == -1);
	}
	
	static boolean isFull(){
		return (top == maxSize - 1);
	}
	
	static void printStack(MyStack s){
		while(s.isEmpty() == false){
			System.out.println(s.pop());
		}
	}
	
	static long maxOfStack(MyStack s1){
		long max = 0;
		while(s1.isEmpty() == false){
			long p = s1.pop();
			if(max < p){
				max = p;
			}
		}
		return max;
	}
	
	public static void main(String[] args){
		MyStack s1 = new MyStack(10);
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
