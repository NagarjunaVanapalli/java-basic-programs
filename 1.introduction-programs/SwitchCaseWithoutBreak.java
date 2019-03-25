
class SwitchCaseWithoutBreak {
	public static void main(String[] args) {
		int i = 5;
		switch (i) {
		case 1:
			System.out.println("sunday");
		case 2:
			System.out.println("monday");
		case 3:
			System.out.println("tuesday");
		case 4:
			System.out.println("wednesday");
		case 5:
			System.out.println("thursday");
		case 6:
			System.out.println("friday");
		case 7:
			System.out.println("saturday");
		default:
			System.out.println("invalid input");
		}
	}
}