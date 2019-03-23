class PatternPrinting7
{
public static void main(String[] args)
{
int n=Integer.parseInt(args[0]);
int tab=n-1;
for(int i=1;i<=n;i++)
{
for(int t=1;t<=tab;t++)
System.out.print(" ");
for(int j=1;j<=i;j++)
System.out.print("* ");
System.out.println( );
tab--;
}
int m= 1;
for(int i=1;i<=n;i++)
{
for(int t=1;t<=m;t++)
System.out.print(" ");
for(int j=n-1;j>=i;j--)
System.out.print("* ");
System.out.println( );
m++;
}
}}
