package datastructure.towerofhanoi;

public class TowerOFHanoi {

	public static void TowerOfHanoiOperation(int size, int[] source, int[] destination, int[] auxilary) {

		if (size == 1) {
			source[size] = destination[size];
			System.out.println(size);
		} else {
			TowerOfHanoiOperation((size - 1), source, auxilary, destination);
			System.out.println(size);
			TowerOfHanoiOperation((size - 1), auxilary, destination, source);

		}

	}

	public static void main(String[] args) {
		int[] source = { 1, 2, 3 };
		int[] dest = new int[3];
		int[] aux = new int[3];

		TowerOfHanoiOperation(3, source, dest, aux);

	}
}
