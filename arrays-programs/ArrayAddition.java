import java.util.Scanner;

class ArrayAddition {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter  no of rows of first array : ");

		int row1 = sc.nextInt();
		System.out.print("Enter  no of colummns of first array: ");

		int col1 = sc.nextInt();
		System.out.print("Enter  no of rows of second array : ");

		int row2 = sc.nextInt();
		System.out.print("Enter  no of columns of second array: ");

		int col2 = sc.nextInt();
		System.out.println("Enter  the first array elements : ");

		int[][] a = new int[row1][col1];

		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter the second array elements : ");

		int[][] b = new int[row2][col2];

		for (int i = 0; i < row2; i++) {
			for (int j = 0; j < col2; j++) {
				b[i][j] = sc.nextInt();
			}
		}

//sum of matrices
		int[][] c = new int[row1][col1];

		if ((row1 == row2) && (col1 == col2)) {
			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < col1; j++) {
					c[i][j] = 0;
					c[i][j] = a[i][j] + b[i][j];
					System.out.print(c[i][j] + " ");
				}
				System.out.println();
			}
		} else {
			System.out.println("Cannot perform addition");
		}
	}
}