class PatternPrinting10
{
public static void main(String[] args)
{
int n=Integer.parseInt(args[0]);
int tab=n+1;
for(int i=1;i<=n;i++)
{
for(int t=n;t>=tab;t--)
System.out.print(" ");
for(int j=n;j>=i;j--)
System.out.print("* ");
System.out.println( );
tab--;
}}}