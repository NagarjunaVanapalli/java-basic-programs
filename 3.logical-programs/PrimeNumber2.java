class PrimeNumber2
{
public static void main(String[] args)
{
int i,count=0;
int n=Integer.parseInt(args[0]);
for(i=1;i<=n;i++)
{
if(n%i==0)
count++;
}
if(count==2)
{
System.out.println("prime");
}
else
{
System.out.println("not prime");
}}}


