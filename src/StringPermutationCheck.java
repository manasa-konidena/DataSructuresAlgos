import java.util.HashMap;

public class StringPermutationCheck {

	public static void main(String[] args){
		String str1 = "manasa";
		String str2 = "aaanms";
		
		System.out.println(checkIfPermutation(str1, str2));
	}
	
	public static String checkIfPermutation(String str1, String str2){
		if(str1.length() != str2.length()){
		  return "false";	
		}
		HashMap<Character, Integer> myMap = new HashMap<>();
		
		for(int i=0; i< str1.length() ; i++){
			if(myMap.containsKey(str1.charAt(i))){
			     myMap.put(str1.charAt(i), myMap.get(str1.charAt(i))+1);
			}
			else
			{
			    myMap.put(str1.charAt(i), 1);
			}
		}
		
		for (HashMap.Entry<Character,Integer> entry : myMap.entrySet()) {
			  Character key = entry.getKey();
			  Integer value = entry.getValue();
			  System.out.println(key + " : "+ value);
			}

		
		for(int j=0; j<str2.length(); j++){
			if(myMap.containsKey(str2.charAt(j))){
				myMap.put(str2.charAt(j), myMap.get(str2.charAt(j))-1);
				if(myMap.get(str2.charAt(j)) < 0){
					return "false";
				}
			}
		}
		
		for (HashMap.Entry<Character,Integer> entry : myMap.entrySet()) {
			  Character key = entry.getKey();
			  Integer value = entry.getValue();
			  System.out.println(key + " : "+ value);
			}
		return "true";
		
	}
}
