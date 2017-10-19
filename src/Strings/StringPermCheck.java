package Strings;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class StringPermCheck {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		String a = in.nextLine();
		String b = in.nextLine();
		
		System.out.println(checkForPerms(a,b));
		
	}
	
	public static boolean checkForPerms(String a, String b){
		if(a.length() != b.length()){
			return false;
		}
		
		HashMap<Character, Integer> myMap = new HashMap<Character, Integer>();
		
		for(int i=0; i<a.length();i++){
			if(myMap.containsKey(a.charAt(i))){
				myMap.put(a.charAt(i), (myMap.get(a.charAt(i))+1));
			} else {
				myMap.put(a.charAt(i), 1);
			}
		}
		
		
		for(int j = 0; j < b.length() ;j++){
			//System.out.println(b.charAt(j) + "  " + myMap.get(b.charAt(j)));
			if(myMap.containsKey(b.charAt(j)) && myMap.get(b.charAt(j)) >= 1){
				myMap.put(b.charAt(j), myMap.get(b.charAt(j)) - 1);
				//System.out.println(b.charAt(j) + " , " + myMap.get(b.charAt(j)));
			} else {
				return false;
			}
			
		}
		
		// check for all zeros
//		for (Entry<Character, Integer> entry : myMap.entrySet()) {
//			if(entry.getValue() != 0){
//				return false;
//			}
//			
//			//System.out.println(entry.getKey()+" : "+entry.getValue());
//		}

		
		return true;
	}
}
