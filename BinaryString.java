package datastructure.recusion;

/*Generate Binary String of array
 * 
 * 
 * */
public class BinaryString {

	static int[] array = new int[2];
	static String sarray = "durgesh";

	public static void BinaryString(int n) {
		if (n < 1) {
			for (int i = 0; i < array.length; i++)
				System.out.print(array[i]);
			System.out.println();
		} else {
			array[n - 1] = 0;
			BinaryString(n - 1);
			array[n - 1] = 1;
			BinaryString(n - 1);
		}

	}

	static {
		BinaryString(2);
	}

	public static void main(String[] args) {

	}
}
