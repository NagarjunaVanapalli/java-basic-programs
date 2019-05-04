import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

class RandomAccessFileExample {
	public static void main(String[] args) throws IOException {
		File f = new File("test.txt");
		RandomAccessFile raf = new RandomAccessFile(f, "rw");
		for (int i = 0; i < raf.length(); i++) {
			byte b = raf.readByte();
			System.out.print((char) b);
		}
	}
}