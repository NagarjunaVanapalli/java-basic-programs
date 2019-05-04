import java.io.*;
class Emp implements Serializable
{
  String name;
  double sal;
}
class ObjectOutPutStreamExample extends Emp
{
public static void main(String args[])throws IOException
{
FileOutputStream fos=new FileOutputStream("kh.txt");
ObjectOutputStream oos=new ObjectOutputStream(fos);
Emp e=new Emp();
e.name="Raghu";
e.sal=10000;
oos.writeObject(e);
}
}