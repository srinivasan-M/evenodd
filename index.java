import java.util.*;
class index
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
String s=ss.nextLine();
String[] c=s.split(" ");
for(int i=0;i<c.length;i++)
{
if(i%2==0)
{
StringBuffer sb=new StringBuffer(c[i]);
System.out.print(sb.reverse()+" ");
}
else
System.out.print(c[i]+" ");
}
}
}
