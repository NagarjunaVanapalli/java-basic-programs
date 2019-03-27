class MethodsAccess
{
void m()
{
System.out.println("name");
}
static void m2()
{
System.out.println("clss");
}
public static void main(String[] args)
{
MethodsAccess sc=new MethodsAccess();
sc.m();
m2();
}
}