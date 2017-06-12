import java.util.*;
class happy
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
int n=ss.nextInt();
int n1=n;
int sq=0,sq1=0;
while(n>0)
{
int r=n%10;
sq+=r*r;
while(sq>9)
{
int r1=sq%10;
sq1+=r1*r1;
sq=sq/10;
}
n/=10;
}
if(sq==1)
{
System.out.print(n1+"is a hpy num");
}
else
System.out.print(n1+"is not a hpy num");
}
}
