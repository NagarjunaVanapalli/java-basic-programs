class ThreeVariablesSwaping
{
public static void main(String[] args)
{
int a=12,b=6,c=15;
a=a+b+c;
c=a-b-c;
b=b;
a=a-b-c;
System.out.println(a);
System.out.println(b);
System.out.println(c);
}}