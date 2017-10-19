package Strings;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Scanner;

public class StringPermOfPallindrome {
	
	public static void main(String[] args){
		
		
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		
		
		
		System.out.println(checkIfPermOfPallindrome(str)); 
		
	}
	
	
	
	
	public static boolean checkIfPermOfPallindrome(String str){
		
		str = str.trim().replaceAll("[^a-zA-Z]", "").toLowerCase();
		
	
		HashMap<Character, Integer> myMap = new HashMap<Character, Integer>();
		
		for(int i=0; i<str.length(); i++){
			if(myMap.containsKey(str.charAt(i))){
				myMap.put(str.charAt(i), (myMap.get(str.charAt(i))+1));
			} else {
				myMap.put(str.charAt(i), 1);
			}
		}
		
		int oddCount = 0;
		
		if(str.length() % 2 == 0){
			for (java.util.Map.Entry<Character, Integer> entry : myMap.entrySet()){
				if(entry.getValue() % 2 == 1){
					return false;
				}
			}
		}else {
			for (java.util.Map.Entry<Character, Integer> entry : myMap.entrySet()){
				if(entry.getValue() % 2 == 1){
					oddCount++;
					if(oddCount > 1){
						return false;
					}
				}
			}
		}
		
//		System.out.println("Came out");
		return true;
		
		
	}

}
