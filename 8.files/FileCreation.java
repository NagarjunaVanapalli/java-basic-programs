import java.io.File;
import java.io.IOException;

class FileCreation {
	public static void main(String args[]) throws IOException {
		File obj = new File("newfile.txt");
		obj.createNewFile();
	}
}