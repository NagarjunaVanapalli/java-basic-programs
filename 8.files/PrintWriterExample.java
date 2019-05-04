import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

class PrintWriterExample {
	public static void main(String[] args) throws IOException {
		FileOutputStream obj = new FileOutputStream("test.txt");
		PrintWriter ps = new PrintWriter(obj, true);
		ps.println("Surya");
		ps.println("Gowtham");
		ps.println("Vinay");
		ps.println("Madhup Kumar");
	}
}
