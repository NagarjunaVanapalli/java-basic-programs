import java.util.Scanner;

class Union {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size : ");
		int n = sc.nextInt();

		System.out.println("Enter the array of A elements : ");

		int[] a = new int[n];

		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		System.out.println("Enter the array of B elements : ");

		int[] b = new int[n];

		for (int i = 0; i < n; i++)
			b[i] = sc.nextInt();

		boolean[] c = new boolean[50];
		for (int i = 0; i < a.length; i++) {
			int key = a[i];
			if (!(c[key])) {
				c[key] = true;
			}
		}

		for (int i = 0; i < b.length; i++) {
			int key1 = b[i];
			if (!(c[key1])) {
				c[key1] = true;
			}
		}
		for (int i = 0; i < c.length; i++) {
			if (c[i]) {
				System.out.print(i + " ");
			}
		}
	}
}
