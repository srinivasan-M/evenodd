import java.util.*;
class hun40
{
public static void main(String args[])
{
String s=args[0];
int sum=0;
for(int i=0;i<s.length();i++)
{
sum+=Character.getNumericValue(s.charAt(i));
}
String s1=String.valueOf(sum);
StringBuffer sb=new StringBuffer(sum);
if(s1.equals(sb.reverse()))
{
System.out.print("Palindrome");
}
else
System.out.print("Not a Palindrome");
}
}
