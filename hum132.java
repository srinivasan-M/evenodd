import java.util.*;
class hum132
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
int n=ss.nextInt();
int n0=n;
for(int i=0;i<n;i++)
{
for(int j=0;j<n0;j++)
{
System.out.print("*");
}
System.out.print(" ");
for(int k=0;k<n0;k++)
{
System.out.print("*");
}
System.out.print("\n");
n0--;
}
}
}
