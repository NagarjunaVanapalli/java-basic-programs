class Break2
{
public static void main(String[] args)
{
l1:for(int i=0;i<4;i++)
{
l2:for(int j=0;j<3;j++)
{
if(j==3)
break l1;
System.out.println(i+"  "+j);
}}}}