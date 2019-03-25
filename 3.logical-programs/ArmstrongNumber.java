class ArmstrongNumber
{
public static void main(String[] args)
{
int rem=0;
int n=Integer.parseInt(args[0]);
int n1=n;
int sum=0;
while(n!=0)
{
rem=n%10;
sum=sum+(rem*rem*rem);
n=n/10;
}
if(sum==n1)
{
System.out.println(n1+" is an arm strong");
}
else
{
System.out.println(n1+" is not arm strong");
}
}}