package PlainJavaPractice;
import java.io.*;
public class StringPallindrome {

	public static void main(String[] args){
		String s1 = "No, & lemonsnomelon";
		s1.trim();
		String s = s1.toLowerCase();
		String f = s.replaceAll("[./,!+&]", "");
		
		if(isPallindrome(f)){
			System.out.println("True");
		} else System.out.println("False");
	}
	

	public static boolean isPallindrome(String s){
		int len = s.length();
		
		for(int i=0,j=len-1; i<=(len/2)-1;i++,j--){
			if(s.charAt(i) != s.charAt(j)){
				return false;
			}
		}
		
		return true;
	}
}
