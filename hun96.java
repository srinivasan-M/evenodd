import java.util.*;
import java.util.Arrays;
class hun96
{
public static void main(String[] args)
{
Scanner ss=new Scanner(System.in);
String s=ss.nextLine();
char[] ch1="abcdefghijklmnopqrstuvwxyz".toCharArray();
int count=0,p=0;
for(String s2:s.split(""))
{
char c=s2.charAt(0);
if(c=='a'&&count==0)
{++count;
System.out.print(ch1[25]);
}
else if(c=='a'&&count!=0)
{
count=0;
System.out.print(ch1[0]);
}
else
p=Arrays.binarySearch(ch1,c);
System.out.print(ch1[p-1]);
}
}
}
