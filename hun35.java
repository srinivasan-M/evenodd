import java.util.*;
class hun35
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
String s=ss.next();
int l=s.length()/2;
int l1=s.length();
if((s.substring(0,l)).equals(s.substring(l)))
{
System.out.print("The given string is a double string");
}
else
	System.out.print("The given string is not a double string");
}
}
