

public class MergeSort {

	public static void main(String[] args){
		int[] array = {3, 2, 1, 65, 43, 54};
		
		mergeSort(array, 0, array.length-1);
		
	}
	
	public static void mergeSort(int[] A,int low, int high){
		if(low < high){
			int midInt = (low + high)/2;
			mergeSort(A, low, midInt);
			mergeSort(A, midInt+1, high);
			merge(A, low, midInt, high);
			
		}
	}
	
	public static void merge(int[] A, int low, int mid, int high){
		int[] sorted = {};
		int n1 = mid - low + 1;
		int n2 = high - mid;
		int[] leftArray = {};
		int[] rightArray = {};
		for(int i = 0; i <= n1-1; i++){
			leftArray[i] = A[i];
		}
		for(int i = mid+1; i <= n2-1; i++){
			rightArray[i] = A[i];
		}
		leftArray[n1+1] = 9999;
		rightArray[n2+1] = 9999;
		int i = 1;
		int j = 1;
		for(int k = low; k <= high-1; k++){
			if(leftArray[i] < rightArray[j]){
				sorted[k] = leftArray[i];
				i++;
			}
			else {
				sorted[k] = rightArray[j];
				j++;
			}
		}
		
	}
}
