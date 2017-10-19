package Strings;

import java.util.Scanner;

public class duplicateCharacters {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		String str = in.next();
		
		System.out.println("n sq" + checkForDupesNSq(str));
		
		System.out.println("n" + checkForDupesN(str));
		
	}
	
	// Using O(n2) complexity
	public static boolean checkForDupesNSq(String str){
		for(int i = 0;i < str.length(); i++){
			for(int j = i+1; j<str.length(); j++){
				if(str.charAt(i) == str.charAt(j)){
					return true;
				}
			}
		}
		
		return false;
		
	}
	
	// O(n) complexity using Boolean array
	public static boolean checkForDupesN(String str){
		boolean[] boolArray = new boolean[256];
		
		for(int i=0;i< boolArray.length; i++){
			boolArray[i] = false;
		}
		
		for(int j=0;j< str.length(); j++){
			
			// convert the character to its ascii value
			int ascii = (int) str.charAt(j);
			
			if(boolArray[ascii] == true){
				return true;
			} else {
				boolArray[ascii] = true;
			}
		}
		
		return false;
	}
	

}
