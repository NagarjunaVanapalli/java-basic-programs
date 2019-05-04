import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

class BufferedStreamExample {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("test.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		int a = (int) System.currentTimeMillis();
		int i = 0;
		while ((i = bis.read()) != -1) {
			System.out.print((char) i);
		}
		int b = (int) System.currentTimeMillis();
		System.out.print(b - a);
	}
}
