class SumOfDigits
{
public static void main(String[] args)
{
int rem=0;
int n=Integer.parseInt(args[0]);
int sum=0;
while(n!=0)
{
rem=n%10;
sum=sum+rem;
n=n/10;
}
System.out.println(sum);
}
}