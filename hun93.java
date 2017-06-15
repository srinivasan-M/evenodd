import java.util.*;
class hun93
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
String s=ss.nextLine();
for(String s1:s.split(" "))
{
StringBuffer sb=new StringBuffer(s1);
System.out.print(sb.reverse()+" ");
}
}
}
