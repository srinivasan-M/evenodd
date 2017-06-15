import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
class hun14
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
int n=ss.nextInt();
ArrayList<Integer> al=new ArrayList<Integer>();
for(int i=0;i<n;i++)
{
al.add(ss.nextInt());
}
Collections.shuffle(al);
System.out.println(al);
}
}
