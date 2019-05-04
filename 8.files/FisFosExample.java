import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class FisFosExample {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("test.txt");
		FileOutputStream fos = new FileOutputStream("write.txt");
		int i = 0;
		while ((i = fis.read()) != -1) {
			fos.write(i);
		}
	}
}