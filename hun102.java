import java.util.*;
class hun102
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
int n=ss.nextInt();
int t,sum=0;
if(n<9)
{
System.out.print("Enter the correct input");
}
else
while(n>0)
{
t=n%10;
sum=sum+t;
n=n/10;
}
System.out.print(sum);
}
}
