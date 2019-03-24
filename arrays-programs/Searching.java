import java.util.Scanner;

class Searching {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the size of array");

		int n = sc.nextInt();
		int[] a = new int[n];

		System.out.println("enter elements");

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("enter key");

		int key = sc.nextInt();

		boolean nn = false;

		for (int i = 0; i < n; i++) {
			if (a[i] == key) {
				nn = true;
				System.out.print("element is found at " + (i + 1) + " position");
				break;
			}
		}
		if (!nn)
			System.out.println("element is not found");
	}
}
