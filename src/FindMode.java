

public class FindMode {

	public static void main(String[] args){
		Integer[] A = {1,1,2,2,2,3,3};
		
		findMode(A);
	}
	
	public static int findMode(Integer[] A){
		mergeSort(A);
		
		int modeIndex = -1;
		int maxCount = 1;
		int currentCount = 1;
		int i = 0;
//		int j = 1;
		for(int j = 1; j < A.length; j++){
			if(A[i] == A[j]){
				currentCount++;
				
				if(maxCount < currentCount){
					maxCount = currentCount;
					modeIndex = j;
				}
			}
			else {
				currentCount = 1;
				i = j;
			}
		}
		
//		while(i < A.length && j < A.length){
//			while(j<A.length && A[i] == A[j]){
//				currentCount++;
//				j++;
//			}
//			if(maxCount < currentCount){
//				maxCount = currentCount;
//				currentCount = 1;
//				modeIndex = i;
//			}
//			i = j;
//			j = i+1;
//		}
		if(maxCount == currentCount &&  modeIndex != A.length-1){
			System.out.println("No mode");
			return modeIndex;
		}
		System.out.println("mode is" + A[modeIndex]);
		System.out.println("Occurs" + maxCount);
		return modeIndex;
		
	}
	
	

	public static void mergeSort(Comparable [ ] a)
	{
		Comparable[] tmp = new Comparable[a.length];
		mergeSort(a, tmp,  0,  a.length - 1);
	}


	private static void mergeSort(Comparable [ ] a, Comparable [ ] tmp, int left, int right)
	{
		if( left < right )
		{
			int center = (left + right) / 2;
			mergeSort(a, tmp, left, center);
			mergeSort(a, tmp, center + 1, right);
			merge(a, tmp, left, center + 1, right);
		}
	}


    private static void merge(Comparable[ ] a, Comparable[ ] tmp, int left, int right, int rightEnd )
    {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

        while(left <= leftEnd && right <= rightEnd)
            if(a[left].compareTo(a[right]) <= 0)
                tmp[k++] = a[left++];
            else
                tmp[k++] = a[right++];

        while(left <= leftEnd)    // Copy rest of first half
            tmp[k++] = a[left++];

        while(right <= rightEnd)  // Copy rest of right half
            tmp[k++] = a[right++];

        // Copy tmp back
        for(int i = 0; i < num; i++, rightEnd--)
            a[rightEnd] = tmp[rightEnd];
    }

	 
}
