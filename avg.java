import java.util.*;
class avg
{
public static void main(String args[])
{
int[] a=new int[args.length];
int c=0,f=0,f1=0;
for(int i=0;i<args.length;i++)
{
a[i]=Integer.parseInt(args[i]);
c++;
}
int l=c,sum=0,sum1=0;
for(int i=0;i<Math.floor(l/2);i++)
{
sum=sum+a[i];
f++;
}
for(int j=(l/2)+1;j<l;j++)
{
sum1=sum1+a[j];
f1++;
}
int avg=sum/f;
int avg1=sum1/f1;
if(avg==avg1)
{
for(int i=0;i<=Math.floor(l/2);i++)
{
System.out.print(a[i]+" ");
}
for(int j=(l/2)+1;j<l;j++)
{
System.out.print("|"+a[j]+" ");
}
}
else
System.out.print("Not Possible");
}
}
