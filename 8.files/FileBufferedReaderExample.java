import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class FileBufferedReaderExample {
	public static void main(String args[]) throws IOException {
		FileReader fr = new FileReader("test.txt");
		BufferedReader br = new BufferedReader(fr);
		String s = "null";
		while ((s = br.readLine()) != null) {
			System.out.println(s);
		}
	}
}