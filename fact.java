import java.util.*;
class fact
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
int num=ss.nextInt();
int fact=1;
for(int i=1;i<=num;i++)
{
fact=fact*i;
}
System.out.println(fact);
}
}
