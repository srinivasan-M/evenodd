import java.util.*;
import java.util.Arrays;
class hun10
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
int n=ss.nextInt();
int n1=ss.nextInt();
int[] a1=new int[n];
int[] a2=new int[n1];
String s=" ";
String s1=" ";
for(int i=0;i<n;i++)
{
a1[i]=ss.nextInt();
s=s.concat(String.valueOf(a1[i]));
}
for(int j=0;j<n1;j++)
{
a2[j]=ss.nextInt();
s1=s1.concat(String.valueOf(a2[j]));
}
if(s.contains(s1))
{
System.out.print("a1 is a subset of a2");
}
else
System.out.print("a1 is not a subset of a2");	
}
}
