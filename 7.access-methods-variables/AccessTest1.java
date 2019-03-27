class AccessTest1
{
int a=10,b=20;
static int c=15,d=30;
void m1()
{
System.out.println(a+" "+b);
System.out.println(c);
}
static void m2()
{
AccessTest1 obj=new AccessTest1();
System.out.println(obj.a);
System.out.println(obj.b);
System.out.println(c);
System.out.println(d);
}
public static void main(String[] args)
{
AccessTest1 sc=new AccessTest1();
sc.m1();
m2();
System.out.println("math");
System.out.println(sc.b);
}}
