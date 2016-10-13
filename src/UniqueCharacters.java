import java.util.HashMap;

public class UniqueCharacters {

	public static void main(String[] args){
		String s = "murali";
		checkForDuplicates(s);
	
	}
	
	public static void checkForDuplicates(String s){
		int count = 1;
		for(int i = 0; i< s.length(); i++){
			for(int j = i+1; j < s.length(); j++){
				
				if(s.charAt(i) == s.charAt(j)){
					count++;
				}
			}
		}
		if(count > 1){
			System.out.println("String has  duplicates");
		}
		else {System.out.println("String has no duplicates");};
	}
	
}
