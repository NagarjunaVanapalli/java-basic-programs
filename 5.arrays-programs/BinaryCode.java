import java.util.Scanner;

class BinaryCode {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the element");

		int n = sc.nextInt();
		int[] a = new int[50];
		int rem = 0;
		int i = 0;

		while (n != 0) {
			rem = n % 2;
			a[i++] = rem;
			n = n / 2;
		}

		System.out.print("The binary code is ");

		for (int j = i - 1; j >= 0; j--) {
			System.out.print(a[j] + "");
		}
	}
}