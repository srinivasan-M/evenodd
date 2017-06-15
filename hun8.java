import java.util.*;
class hun8
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
int n=ss.nextInt();
System.out.print("Enter the array elements");
int[] a=new int[n];
for(int i=0;i<n;i++)
{
a[i]=ss.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
for(int k=j+1;j<n;j++)
{
if(a[i]+a[j]==a[k])
{
System.out.print(+a[i]+ " "+a[j]+"->"+a[k]);
System.exit(0);
}
}
}
}
}
}
