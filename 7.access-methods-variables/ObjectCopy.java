class ObjectCopy
{
int a=10;
ObjectCopy()
{

}
ObjectCopy(ObjectCopy obj)
{
this.a=obj.a;
}
public static void main(String[] args)
{
ObjectCopy d=new ObjectCopy();
ObjectCopy d1=new ObjectCopy(d);
System.out.println(d.a);
System.out.println(d1.a);
}}


