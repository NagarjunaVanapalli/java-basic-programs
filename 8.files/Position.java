import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

class Position {
	public static void main(String[] args) throws IOException {
		File f = new File("test.txt");
		RandomAccessFile raf = new RandomAccessFile(f, "rw");
		for (int i = 0; i < raf.length(); i++) {
			byte b = raf.readByte();
			System.out.print((char) b);
		}
		System.out.println();
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter The position what u want");
			int p = sc.nextInt();
			raf.seek(p);
			System.out.print("The " + raf.getFilePointer() + " position is:" + " ");
			byte b2 = raf.readByte();
			System.out.println((char) b2);
			if (p != 0) {
				continue;
			} else {
				System.exit(0);
			}
		}
	}
}