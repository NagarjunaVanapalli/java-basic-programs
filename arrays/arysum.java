import java.util.*;
class arysum
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array");
int n=sc.nextInt();
int a[]=new int[n];
float sum=0;
System.out.println("enter elements");
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
for(int i=0;i<n;i++)
sum=a[i]+sum;
System.out.println(" the sum = "+sum);
System.out.println("the average ="+(sum/n));

}}
