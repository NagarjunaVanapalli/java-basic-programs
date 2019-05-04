import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

class FileInputStreamExample {
	private static FileInputStream fis;

	public static void main(String[] args) throws IOException {
		File f = new File("test.txt");
		if (f.exists()) {
			fis = new FileInputStream(f);
			int i = 0;
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
		}
	}
}