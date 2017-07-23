import java.util.*;
class hun112
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
int n=ss.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=ss.nextInt();
if(a[i]%2==0 || a[i]==1)
{
System.out.println("True");
}
else
System.out.println("False");
}
}
}
