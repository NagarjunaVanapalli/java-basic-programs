class NonStaticMethodAccess
 {
void ma()
{
System.out.println("method");
}
public static void main(String[] args)
{
NonStaticMethodAccess st=new NonStaticMethodAccess();
st.ma();
}}
