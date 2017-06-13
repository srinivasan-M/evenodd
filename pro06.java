import java.util.*;
class pro06
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
HashSet<Integer> hs=new HashSet<Integer>();
int m=-1;
for(int i=a.length-1;i>=0;i--)
{
if(hs.contains(a[i]))
{
m=i;
}
else
hs.add(a[i]);
}
if(m==-1)
System.out.println("There is no repeating elements:");
else
System.out.print("The first repeating element is:"+a[m]);
}
}
