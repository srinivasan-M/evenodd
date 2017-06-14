import java.util.*;
class hun103
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
int n=ss.nextInt();
int sum=0;
String s=" ";
if(n<9)
{
System.out.print("Enter the correct input");
}
else
s=String.valueOf(n);
for(String s1:s.split(""))
{
	int a=Integer.valueOf(s1);
	int inc=1;
	for(int i=0;i<s.length();i++)
	{
		inc=inc*a;
	}
	sum=sum+inc;
}
System.out.print(sum);
}
}
