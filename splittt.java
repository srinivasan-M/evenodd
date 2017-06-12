import java.util.*;
class splittt
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
int n=ss.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++)
{
a[i]=ss.nextInt();
}
System.out.print("enter the key steps");
int k=ss.nextInt();
for(int j=(k+1);j<n;j++)
{
System.out.print(a[j]);
}
for(int l=0;l<=k;l++)
{
System.out.print(a[l]);
}
}
}
