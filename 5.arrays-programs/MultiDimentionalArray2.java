import java.util.Scanner;

class MultiDimentionalArray2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no of matrices");
		int mat = sc.nextInt();

		System.out.println("Enter the no of rows");
		int rows = sc.nextInt();

		System.out.println("Enter the no of columns");
		int cols = sc.nextInt();

		int a[][][] = new int[mat][rows][cols];
		System.out.println("Enter the elements");

		for (int k = 0; k < mat; k++) {
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					a[k][i][j] = sc.nextInt();
				}
			}
		}
		// print the array
		System.out.println("The elements are");

		for (int k = 0; k < mat; k++) {
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					System.out.print(a[k][i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}