import java.util.*;
import java.lang.*;
class hun20
{
public static void main(String args[])
{
ArrayList<Integer> al=new ArrayList<Integer>();
Scanner ss=new Scanner(System.in);
System.out.print("Enter the limit");
int l=ss.nextInt();
int m=0,flag=0,i,count=0;
int l1=ss.nextInt();
for(i=l;i<=l1;i++)
{
boolean isprime=true;
for(int j=2;j<i;j++)
{
if(i%j==0)
{
isprime=false;
break;
}
}
if(isprime)
{
String str=Integer.toBinaryString(i);
String str1=str.replaceAll("1","");
count=(str.length())-(str1.length());
al.add(count);
}
}
System.out.print(al.size());
}
}
