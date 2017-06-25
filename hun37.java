import java.util.*;
class hun37
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
String s=ss.next();
StringBuffer sb=new StringBuffer(s);
for(int i=0;i<s.length();i++)
{
sb.deleteCharAt(i);
if(palindrome(sb))
{
System.out.print("Index:"+i+" "+sb);
}
}
}
public boolean palindrome(String s1)
{
StringBuffer s2=new StringBuffer();
s2=s1.reverse();
if(s1.equals(s2))
{
return true;
}
else
return false;
}
}
