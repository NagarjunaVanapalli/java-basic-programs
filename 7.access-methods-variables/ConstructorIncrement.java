class ConstructorIncrement
{
static int a=0;
ConstructorIncrement()
{
++a;
}
public  static void main(String[] args)
{
ConstructorIncrement obj=new ConstructorIncrement();
ConstructorIncrement obj1=new ConstructorIncrement();
ConstructorIncrement obj2=new ConstructorIncrement();
ConstructorIncrement obj3=new ConstructorIncrement();
System.out.println(a);
}}
