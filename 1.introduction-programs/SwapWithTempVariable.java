class SwapWithTempVariable {
	public static void main(String args[]) {
		int a = 6, b = 8, temp = 0;
		temp = a;
		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);
	}
}