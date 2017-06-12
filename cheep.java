import java.util.*;
class cheep
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
String a=ss.nextLine();
String b=ss.nextLine();
int l=a.length();
int l1=b.length();   
int cost=0;    
if(a.equals(b))
{
System.out.print(a);
}
else
{
if(l>l1)
{
a=a.substring(0,a.length());
//System.out.println(a);
}
if(l<l1)
{
int l2=l1-1;
a=a.concat(b.substring(l,l1));
//System.out.println(a);
}
char[] ch=a.toCharArray();
char[] ch1=b.toCharArray();
StringBuffer sb=new StringBuffer(a);
StringBuffer sb1=new StringBuffer(b);
for(int i=0;i<ch.length;i++)
{
if(ch[i]!=ch1[i])
{
cost=cost+5;
sb=sb.replace(i,i+1,String.valueOf(ch1[i]));
}
}
System.out.print(cost);
}
}
}
