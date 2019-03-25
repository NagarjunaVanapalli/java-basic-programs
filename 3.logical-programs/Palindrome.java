class Palindrome
{
public static void main(String[] args)
{
int rem=0;
int res=0;
int n=Integer.parseInt(args[0]);
 int n1=n;
while(n!=0)
{
rem=n%10;
res=res*10+rem;
n=n/10;
}
if (res==n1)
{
System.out.println(+n1+" is  palindrome");
}
else
{
System.out.println(+n1+" is not palindrome");
}}}