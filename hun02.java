import java.util.*;
import java.util.Arrays;
class hun02
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
int n=ss.nextInt();
int[] a=new int[n];
String strsep="";
for(int i=0;i<n;i++)
{
a[i]=ss.nextInt();
}
Arrays.sort(a);
String str=Arrays.toString(a);
str=str.replaceAll(",",strsep).replace("[","").replace("]","").replace(" ","");
StringBuffer sb=new StringBuffer(str);
StringBuffer rev=sb.reverse();
//System.out.print(rev);
if(n%2==0)
{
while(n>1)
{                                                  															
sb.insert(n-3,",");
n-=3;
}
System.out.print(sb);
}
else
while(n>2)
{                                                  															
sb.insert(n-3,",");
n-=3;
}
System.out.print(sb);
}
}
