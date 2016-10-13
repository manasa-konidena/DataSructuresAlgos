import java.util.*;

public class HolyNumbers {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
		long startTime = System.currentTimeMillis(); // Record the start time 
		System.out.println(getnthholynumber(n));
		long endTime   = System.currentTimeMillis(); // Record the end time
		long totalTime = endTime - startTime;
		System.out.println(totalTime/1000); // Print the total time
    }
    
    static long getnthholynumber(int n){
		long i = 1; // To get to n, which is when the nth holy number is found
		long cur = 3; // 3 is the 1st holy number
		while(i != n+1){
			if(isHoly(cur)){
				i = i + 1;		// increment i only when cur is holy, so that loop runs                                        till we find the nth holy number		
			}
			cur = cur + 1; // Increment cur to check if every number encountered is holy.
		}
		return cur-1; // After nth holy number has been found, return it
	}
	
	static boolean isHoly(long n){
		if(n< 3){
			return false;
		}
		while(n % 7 == 0){
			n= n/7;
		}
		while(n % 3 == 0){
			n = n/3;
		}
		return n == 1;
	}
}
