import java.util.Scanner;

class ArrayElementsPrinting {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the size of array");

		int n = sc.nextInt();
		int[] a = new int[n];

		System.out.println("Please enter the elements");

		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		for (int i = 0; i < n; i++)

			System.out.print(a[i] + " ");

	}
}
