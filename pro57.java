import java.util.*;
class pro57
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
String s1=ss.nextLine();
String s2=ss.nextLine();
int c=0;
for(int i=0;i<s2.length();i++)
{
for(int j=i;j<s2.length();j++)
{
String a=s2.substring(i,j+1);
if(a.length()>2 &&s1.contains(a)){
c++;
System.out.print("True");
break;
}
}
}
if(c==0)
System.out.print("False");
}
}
