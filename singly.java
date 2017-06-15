import java.util.*;
import java.util.LinkedList;
class singly
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
LinkedList<Character> l=new LinkedList<Character>();
int len=ss.nextInt();
ss.nextLine();
String s="";
for(int i=0;i<len;i++)
{
l.add(ss.next().charAt(0));
s=s+(l.get(i));
}
StringBuffer sb=new StringBuffer(s);
StringBuffer rev=sb.reverse();
String s1=new String(rev);
System.out.print(rev);
if(s.equals(s1))
{
System.out.print("Palindrome");
}
else
System.out.print("Not a Palindrome");
}
}
