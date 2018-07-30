import java.io.*;
public class nan
{
public static void main(string arg[])
{
int a,b,c,rev;
System.out.print("enter the number:");
c=1;
while(a!=0)
{
b=a%10;
rev=rev*10+b;
a=a/10;
}
if(rev==c)
{
System.out.print("yes");
}
else
{
System.out.print("no");
}
}
}
