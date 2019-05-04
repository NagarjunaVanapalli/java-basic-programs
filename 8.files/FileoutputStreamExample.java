import java.io.FileOutputStream;
import java.io.IOException;

class FileoutputStreamExample {

	public static void main(String args[]) throws IOException {
		FileOutputStream fos = new FileOutputStream("create.txt");
		fos.write('a');
		fos.write(75);
	}
}