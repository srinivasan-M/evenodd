import java.util.*;
class EstrO
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
String s1=ss.nextLine();
int l=s1.length();
String even="";
String odd="";
if(l%2==0)
{
for(int i=0;i<=l-2;i+=2)
{
even=even+s1.charAt(i+1) + "" + s1.charAt(i);
}
}
else 
{
odd=even+s1.charAt(l-1);
}
System.out.print(odd);
System.out.print(even);
}
}
