import java.util.*;
class hun66
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
System.out.print("Enter the number of strings u r enter");
int n=ss.nextInt();
ss.nextLine();
String[] s=new String[n];
int count=0;
for(int i=0;i<n;i++)
{
s[i]=ss.nextLine();
}
for(String s1:s)
{
if(s1.length()>2)
{
if(s1.charAt(0)=='1' && s1.charAt(1)=='0')
{
count++;
}
else(s1.charAt(0)=='0' && s1.charAt(1)=='1')
{
count++;
}
}
}
System.out.print(count);
}
}
