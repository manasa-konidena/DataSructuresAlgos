import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Substring {
 
	public static void main(String[] args){
		String s = "abcdef";
		HashSet<String> set = new HashSet<String>();
//		starting(s, set);
//		end(s, set);
//		middle(s, set);
		
		recurSubstring(s, 0, s.length(), set);
		ArrayList<String> A = new ArrayList<>();
		int i = 0;
		for(String str : set){
		    A.add(str);
		}
		
		Collections.sort(A);
		
//		for(int j=0; j<A.size(); j++){
//			int count = 0;
//			if(isPallindrome(A.get(j))){
//				count++;
//			}
//		}
		
	    for(int k =0; k<A.size(); k++){
	    	  System.out.println(A.get(k));
	    }
		
		//System.out.println(A.get(A.size()-1));
	
	}
	
	private static boolean isPallindrome(String string) {
		// TODO Auto-generated method stub
		String str = string;
		StringBuffer str1 = new StringBuffer(str);
		str1 = str1.reverse();
		System.out.println("rev ->"+str1);
		
		if(str1.equals(string)){
			System.out.println("true");
			System.out.println("nonrev ->"+string);
			return true;
		}
		else 
			System.out.println("false");
		    System.out.println("nonrev ->"+string);
		return false;
		
	}

	public static void starting(String s,HashSet<String> set){
		for(int i=0; i<s.length(); i++){
			String sub = s.substring(i);
			set.add(sub);
		}
	}
	
	public static void end(String s,HashSet set){
		for(int i=s.length(); i>=0; i--){
			String sub = s.substring(0, i);
			set.add(sub);
		}
	}
	
	public static void middle(String s, HashSet set){
		int i = 0;
		int j = s.length()-1;
		while(i<=j){ 
			String sub1 = s.substring(i, i+1);
			set.add(sub1);
			String sub2 = s.substring(j-1, j+1);
			set.add(sub2);
			String sub3 = s.substring(i, j+1);
			set.add(sub3);
			i++;
			j--;			
		}	
	}
	
	
	
	public static void recurSubstring(String s, HashSet set){
		if(s.length() == 1){
			set.add(s);
		}
		else{
			for(int i=start; i<end; i++){
				String sub = s.substring(i);
				set.add(sub);
			}
			
			for(int i=end; i>=start; i--){
				String sub = s.substring(0, i);
				set.add(sub);
			}
			
			recurSubstring(s.substring(start+1, end), set);
		}
	}
}
