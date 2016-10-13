import java.util.HashSet;

public class RepeatingNumbersHash {

	public static void main(String[]args){
		int[] A = {9, 1, 3,4, 10};
		System.out.println(checkDupes(A));
	}
	
    public static String checkDupes(int[] A){
    		HashSet<Integer> hs = new HashSet<Integer>();
    		
    		for(int i = 0; i<A.length; i++){
    			if(hs.contains(A[i])){
    				return "There are duplicates";
    			}
    			hs.add(A[i]);
    		}
    		return "There are no duplicates";
    }
}
