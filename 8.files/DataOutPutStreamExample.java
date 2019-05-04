import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class DataOutPutStreamExample {
	public static void main(String args[]) throws IOException {
		FileOutputStream fos = new FileOutputStream("ss.text");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeDouble(975.9);
		dos.writeInt(5678);
		dos.writeBoolean(true);
//dos.close();
		FileInputStream fis = new FileInputStream("ss.text");
		DataInputStream dis = new DataInputStream(fis);
		double dd = dis.readDouble();
		int b = dis.readInt();
		boolean bc = dis.readBoolean();
		System.out.println(b);
		System.out.println(bc);
		System.out.println(dd);
	}
}