class AccessTest4
{
int a=10;
int b=15;
AccessTest4(int a,int b)
{
this.a=a;
this.b=b;
}
float c;
float d;
AccessTest4(float c,float  d)
{
this.c=c;
this.d=d;
}
public static void main(String[] args)
{
AccessTest4 d=new AccessTest4(1,15);
System.out.println(d.a);
System.out.println(d.b);
AccessTest4 d1=new AccessTest4(1.3f,15.8f);
System.out.println(d1.a);
System.out.println(d1.b);

}}