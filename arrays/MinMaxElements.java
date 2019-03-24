import java.util.Scanner;

class MinMaxElements {

	public static void main(String[] args) {

		int max = 0, min = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the no of rows");
		int rows = sc.nextInt();

		System.out.println("Please enter the no of columns");
		int cols = sc.nextInt();

		int[][] a = new int[rows][cols];
		System.out.println("Please enter the elements");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				min = a[0][0];
				if (min > a[i][j])
					min = a[i][j];
				if (max < a[i][j])
					max = a[i][j];
			}
		}
		System.out.println("Minimum num is: " + min);
		System.out.println("Maximum num is: " + max);
	}

}