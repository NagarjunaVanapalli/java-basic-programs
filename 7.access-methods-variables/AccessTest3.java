class AccessTest3
{
static void add() 
{
System.out.println(18+20);
}
int  sub()
{
int a=10,b=3;
System.out.println(a-b);
return(0);
}
int mul(int a,int b)
{
System.out.println(a*b);
return(82);
}
int div(int a,int b)
{
return(a/b);
}
public static void main(String[] args)
{
AccessTest3 sc=new AccessTest3();
add();
sc.sub();
sc.mul(12,3);
System.out.println(sc.div(12,3));
}
} 