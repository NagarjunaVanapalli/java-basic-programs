import java.io.*;
import java.util.*;
class FileBufferedWriterExample
{
public static void main(String args[])throws IOException
{
FileReader fr=new FileReader("bd.text");
BufferedReader br=new BufferedReader(fr);
String s=null;
while((s=br.readLine())!=null)
{
System.out.println(s);
}
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String k=sc.next();
FileWriter fw=new FileWriter("md.text");
BufferedWriter bw=new BufferedWriter(fw);
bw.write(k);
//System.out.println();
bw.write("know");
bw.flush();
}}

