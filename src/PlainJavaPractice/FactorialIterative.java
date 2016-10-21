package PlainJavaPractice;

public class FactorialIterative {
	public static void main(String[] args){
		int n = 3;
		int res = 1;
		while(n!=1){
			res = res * n;
			n=n-1;
		}
		System.out.println(res);
	}
}
