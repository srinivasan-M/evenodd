import java.util.*;
class hun65
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
String s=ss.nextLine();
String c=ss.next();
String rpl=s.replaceAll(c,"");
System.out.print(rpl);
}
}
