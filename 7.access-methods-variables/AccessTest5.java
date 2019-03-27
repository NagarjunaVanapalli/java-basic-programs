class AccessTest5
{
static int a=0;
AccessTest5()
{
a++;
}
public  static void main(String[] args)
{
AccessTest5 obj=new AccessTest5();
AccessTest5 obj1=new AccessTest5();
AccessTest5 obj2=new AccessTest5();
AccessTest5 obj3=new AccessTest5();
System.out.println(a);
}}
