import java.io.*;
public class pal
{
public static void main(String arg[])
{
int a,b,c,rev=0;
system.out.print("enter the number:");
c=a;
while(a!=0)
{
b=a%10;
rev=rev*10+b;
a=a/10;
}
if(rev==c)
{
system.out.print("yes");
}
else
{
system.out.print("no");
}
}
}
