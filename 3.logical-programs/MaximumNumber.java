class MaximumNumber
{
public static void main(String[] args)
{
int rem=0,max=0;
int n=Integer.parseInt(args[0]);
while(n!=0)
{
rem=n%10;
if(max<rem)
max=rem;
n=n/10;
}
System.out.println("maximum num is "+max);
}}