package datastructure.recusion;

/*Generate All String of length n drawn from 0... k-1
 * 
 * 
 * */
public class KString {

	static int[] sarray = {1,2,3};

	public static void BinaryString(int n,int k) {
		if (n < 1) {
			for (int i = 0; i < sarray.length; i++)
				System.out.print(sarray[i]);
			System.out.println();
		} else {
			for(int j=0;j<k;j++)
			{
				sarray[n-1]=j;
				BinaryString(n-1, k);
			}
				
		}

	}

	

	public static void main(String[] args) {

		BinaryString(3, 4);
	}
}
