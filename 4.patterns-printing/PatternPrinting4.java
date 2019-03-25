class PatternPrinting4
{
public static void main(String args[]) {
int n=Integer.parseInt(args[0]);
int tab;
tab=n-1;
for(int i=1;i<=n;i++) {
for(int t=1;t<=tab;t++)
System.out.print(" ");
for(int j=1;j<=i;j++)
   System.out.print("* ");
    System.out.println( );
tab--;
      }
  }
}