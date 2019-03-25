class PatternPrinting3
{
public static void main(String[] args)
{
int n=Integer.parseInt(args[0]);
int p=97;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
System.out.print((char)(p++)+" ");
System.out.println();
}}}