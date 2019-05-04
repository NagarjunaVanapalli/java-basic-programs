import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

class PrintStreamExample {
	public static void main(String[] args) throws IOException {
		FileOutputStream obj = new FileOutputStream("DGY.text");
		PrintStream ps = new PrintStream(obj, true);
		ps.println("Surya");
		ps.println("gowtham");
		ps.println("vinay");
		ps.println("madhup kumar");
	}
}
