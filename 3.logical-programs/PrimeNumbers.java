class PrimeNumbers
{
public static void main(String[] args)
{
int i,count=0;
int n;
for(n=0;n<=10;n++)
{
count=0;
for(i=1;i<=n;i++)
{
if(n%i==0)
count++;
}
if(count==2)
{
System.out.println(i+" is a prime");
}
else
{
System.out.println(i+" is a  not prime");
}
}}}
