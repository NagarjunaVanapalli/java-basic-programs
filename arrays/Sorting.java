import java.util.*;

class Sorting {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the size of array");

		int n = sc.nextInt();
		int[] a = new int[n];
		int temp = 0;

		System.out.println("Please enter the elements");

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
