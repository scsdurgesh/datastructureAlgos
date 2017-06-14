package datastructure.recusion;


/*find out array is sorted or not using recursion.* 
 * 
 * */

public class SortedArray {

	public static int checkSorted(int A[],int n)
	{
		if(n==1)
			return 1;
			return(A[n-1]<A[n-2]?0:checkSorted(A, n-1));
	}
	public static void main(String[] args) {
		int[] array={1,3,4,5,6};

		if(checkSorted(array, array.length)==1)
		System.out.println("Sorted Array");
		else
			System.out.println("Unsorted Array");
	}
}
