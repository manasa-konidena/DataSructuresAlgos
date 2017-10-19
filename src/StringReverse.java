
public class StringReverse {

	public static void main(String[] args){
		String s = "    man    asa   ";
		
		System.out.println(reverseString(s));
	}
	
	public static String reverseString(String s){
		String rev = "";
		
		for(int i=s.length()-1; i >= 0; i--){
			rev = rev + s.charAt(i);
		}
		return rev;
	}
}
