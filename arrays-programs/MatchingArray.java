
import java.util.Arrays;

class MatchingArray {

	public static void main(String[] args) {

		int[] firstArray = new int[2];

		int[] secondArray = new int[2];

		firstArray[0] = 1;
		firstArray[1] = 2;

		secondArray[0] = 1;
		secondArray[1] = 2;

		if (Arrays.equals(firstArray, secondArray))
			System.out.println("same");
		else
			System.out.println("difference");

	}

}
