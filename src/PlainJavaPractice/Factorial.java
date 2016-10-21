package PlainJavaPractice;

public class Factorial {

	public static void main(String[] args){
		int x = 5;
		
		System.out.println(computeFactorial(x));
	}
	
	public static int computeFactorial(int number){
		if(number == 1 || number == 0){
			return 1;
		}else{
			return number*computeFactorial(number-1);
		}
	}
}
