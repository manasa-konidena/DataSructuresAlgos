package Stacks;

import java.util.Stack;

public class ParanthesisChecker {

	public static void main(String[] args){
		String s1 = "[{}])";
		System.out.println(checkForParanthesis(s1));
	}
	
	public static String checkForParanthesis(String str){
		Stack<Character> s = new Stack<>();
		
		for(int i=0; i<str.length(); i++){

			if((str.charAt(i) == '[') ||
					(str.charAt(i) == '{') ||
					(str.charAt(i) == '(')){
				
				s.push(str.charAt(i));
				
			}
			else if(!s.isEmpty()){
					char c = s.pop();
					if(!isCompatible(c, str.charAt(i))){
						s.push(c);
				}
				}
			else{s.push(str.charAt(i));}
			
		}
		if(s.isEmpty()){
			return "true";
		}
		else{ return "false";}
	
//		while(!s.isEmpty()){
//			System.out.println(s.pop());
//		}
		
	}
	
	public static boolean isCompatible(char c1, char c2){
		return ((c1 == '[' && c2 == ']')||
				(c1 == '{' && c2 == '}')||
				(c1 == '(' && c2 == ')'));
	}
}
