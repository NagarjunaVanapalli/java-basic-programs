class Factorial1
{
public static void main(String[] args)
{
int fact=1;
int i;
int n=Integer.parseInt(args[0]);
for(i=n;i>=1;i--)
{
fact=fact*i;
}
System.out.println("the factorial of "+n+" is "+fact);
}
}
