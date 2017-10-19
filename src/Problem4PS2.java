import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Problem4PS2 {

	public static void main(String[] args){
		List<Integer> raceArray = new ArrayList<Integer>();
		List<Integer> orderedArray = new ArrayList<Integer>();
		raceArray.add(2);
		raceArray.add(4);
		raceArray.add(4);
		raceArray.add(6);
		raceArray.add(6);
		raceArray.add(5);
		raceArray.add(5);
		raceArray.add(1);
		raceArray.add(1);
		raceArray.add(3);
		findTheRaceOrder(raceArray, orderedArray);
	}
	
	public static void findTheRaceOrder(List<Integer> raceArray, List<Integer> orderedArray){
//		int pivot = ThreadLocalRandom.current().nextInt(0, raceArray.size());
		int pivot = 4;	
		System.out.println(pivot);
			
		
		if(pivot % 2 == 0){
			orderedArray.add(raceArray.get(pivot + 1));
			orderedArray.add(raceArray.get(pivot));
			raceArray.remove(pivot + 1);
			raceArray.remove(pivot);
		}
		else {
			orderedArray.add(raceArray.get(pivot));
			orderedArray.add(raceArray.get(pivot - 1));
			raceArray.remove(pivot);
			raceArray.remove(pivot - 1);
		}

		
		checkForOrder(raceArray, orderedArray);
		
		
		// checking output
		System.out.println();
		for(int i = 0; i < orderedArray.size(); i++) {   
		    System.out.print(orderedArray.get(i));
		}
		System.out.println();
		for(int i = 0; i < raceArray.size(); i++) {   
		    System.out.print(raceArray.get(i));
		}		
	}
	
	public static void checkForOrder(List<Integer> raceArray, List<Integer> orderedArray){
		// finding the first element in ordered array to see who saw him
	 
		if(raceArray.size() < 1){ return; }
//		String found = "no";
		
		for(int k = 0; k < raceArray.size(); k=k+2) {
			if(orderedArray.get(0) == raceArray.get(k)){
				
				orderedArray.add(0, raceArray.get(k+1));
				raceArray.remove(k+1);
				raceArray.remove(k);
			}			
		}
		for(int k = 1; k < raceArray.size(); k=k+2) {
			if(orderedArray.get(orderedArray.size()-1) == raceArray.get(k)){
				
				orderedArray.add(orderedArray.size(), raceArray.get(k-1));
				raceArray.remove(k);
				raceArray.remove(k-1);
			}		
			}
		
		checkForOrder(raceArray, orderedArray);
	
	}
}
