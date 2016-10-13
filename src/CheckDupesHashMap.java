import java.util.HashMap;

public class CheckDupesHashMap {

	public static void main(String[] args){
		int[] A = {9, 8, 1, 2, 5,4};
		System.out.println(checkDupes(A));
	}
	
	public static String checkDupes(int[] A){
		HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();
		
		for(int i=0; i<A.length; i ++){
			if(myMap.containsKey(A[i])){
				return "There are duplicates";
			}
			myMap.put(A[i], 1);
		}
		return "There are no duplicates";
	}
}
