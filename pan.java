import java.util.HashSet;
import java.util.Set;
import java.util.*;
class pan
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
String s=ss.nextLine();
Set p=new HashSet();
for(char ch='a';ch<='z';ch++)
{
p.add(ch);
}
s=s.toLowerCase();
for(int i=0;i<s.length();i++)
{
p.remove(s.charAt(i));
}
if(p.isEmpty())
{
System.out.print("Given string is a pangram");
}
else
System.out.print("Given string is not a pangram");
}
}
