import java.util.Scanner;

class SumofElements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the size of array");
		int n = sc.nextInt();

		int[] a = new int[n];
		float sum = 0;

		System.out.println("Please enter the elements");

		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		for (int i = 0; i < n; i++)
			sum = a[i] + sum;

		System.out.println("Sum of the Elements: " + sum);
		System.out.println("Average of the elements: " + (sum / n));

	}

}
