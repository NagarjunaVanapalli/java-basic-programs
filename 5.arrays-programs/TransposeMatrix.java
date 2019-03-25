import java.util.Scanner;

class TransposeMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no of rows");
		int rows = sc.nextInt();

		System.out.println("Enter the no of columns");
		int cols = sc.nextInt();

		int[][] a = new int[rows][cols];

		System.out.println("Enter the elements");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				a[i][j] = sc.nextInt();
			}
		}

//print the array
		System.out.println("The transpose matrix is:");
		for (int j = 0; j < cols; j++) {
			for (int i = 0; i < rows; i++)
				System.out.print(a[i][j] + " ");
			System.out.println();
		}

	}

}