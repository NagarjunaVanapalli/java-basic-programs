import java.util.Scanner;

class Intersection {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter  the size : ");
		int n = sc.nextInt();

		System.out.println("Enter  the array of A elements : ");

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Enter  the array of B elements : ");

		int[] b = new int[n];

		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}

		boolean[] c = new boolean[50];

		boolean kk = false;

		for (int i = 0; i < a.length; i++) {
			int key = a[i];
			if (!(c[key])) {
				c[key] = true;
			}
		}

		System.out.print("The intersection of a and b is ");

		for (int i = 0; i < b.length; i++) {
			int key1 = b[i];

			if ((c[key1])) {
				kk = true;
				System.out.print(key1 + " ");
			}

		}

		if (!kk) {
			System.out.print("No intersection found");
		}

	}
}
