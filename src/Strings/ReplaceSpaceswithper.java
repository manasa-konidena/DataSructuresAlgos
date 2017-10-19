package Strings;

import java.util.Scanner;

public class ReplaceSpaceswithper {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		
		System.out.println(replaceSpaces(str));
	}

	public static String replaceSpaces(String str1){
		String str = str1.trim();
		
		char[] charArray = new char[str.length()];
		
		boolean flag = true;
		
		charArray = str.toCharArray();
		
		String finalStr = "";
		
		for(int i=0; i < charArray.length; i++){
			if(charArray[i] == ' ' && flag == true){
				finalStr = finalStr + "%20";
				flag = false;
			} else if(charArray[i] != ' '){
				finalStr = finalStr + Character.toString(charArray[i]);
				flag = true;
			}
		}
		
		return finalStr;
		
	}
	
}
