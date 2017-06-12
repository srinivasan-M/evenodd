import java.util.*;
class digirev
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
String s=ss.nextLine();
StringBuffer sb=new StringBuffer(s);
StringBuffer rev=sb.reverse();
String s1=new String(rev);
int a=Integer.valueOf(s1);
System.out.print(a);
}
}
