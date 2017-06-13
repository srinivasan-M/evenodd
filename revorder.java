import java.util.ArrayList;
import java.util.*;
import java.util.Collections;
class revorder
{
public static void main(String args[])
{
	Scanner ss=new Scanner(System.in);
	int no=ss.nextInt();
ArrayList<String> al=new ArrayList<String>();
for(int i=0;i<no;i++)
{
	String s=ss.next();
	al.add(s);
}
Collections.reverse(al);
for(String a:al)
{
	System.out.print(a);
}
}
}
