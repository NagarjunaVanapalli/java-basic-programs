class NestedSwitch
{
public static void main(String[] args)
{
int m=Integer.parseInt(args[0]);
int n=Integer.parseInt(args[1]);
switch(m)
{
case 1:System.out.println("aadara");
break;
case 2:System.out.println("global");
break;
case 3:System.out.println("acropetal");
break;
case 5:System.out.println("emphases");
switch(n)
{
case 1:System.out.println("wipro");
break;
case 2:System.out.println("tcs");
break;
case 3:System.out.println("emc");
break;
case 4:System.out.println("antrix");
break;
    }
break;
default:System.out.println("invalid input");
}}}