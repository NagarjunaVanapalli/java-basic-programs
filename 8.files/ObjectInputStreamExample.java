import java.io.*;

class ObjectInputStreamExample
{
public static void main(String args[])throws Exception
{
FileInputStream fis=new FileInputStream("kh.txt");
ObjectInputStream ois=new ObjectInputStream(fis);
Object sub=ois.readObject();
Emp detail=(Emp)sub;
System.out.println(detail.name);
System.out.println(detail.sal);
System.out.println("mani deva");
}
}