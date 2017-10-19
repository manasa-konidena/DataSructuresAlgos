
public class RepeatingNumber {

	public static void main(String[] args){
		int[] myArray = {9,1,3,4,10,9};
		System.out.println(checkDuplicates(myArray));
	}
	
	public static String checkDuplicates(int[] myAr){
		bubbleSort(myAr);
		for(int i=0; i<myAr.length-1; i++){
			if(myAr[i]==myAr[i+1]){
				return "There are duplicates";
			}
		}
		return "There are no duplicates";
	}
	
	public static void bubbleSort(int[] myArray){
		for(int i=0;i<myArray.length-1;i++){
			if(myArray[i]>myArray[i+1]){
				int temp = myArray[i];
				myArray[i]= myArray[i+1];
				myArray[i+1] = temp;
			}
		}
	}
}
