import java.util.*;
class tow
{
public void prob(int n,String Start,String aux,String end)
{
if(n==1)
{
System.out.println(Start+"->"+end);
}
else
{
prob(n-1,Start,end,aux);
System.out.println(Start+"->"+end);
prob(n-1,aux,Start,end);
}
}
public static void main(String args[])
{
tow t=new tow();
Scanner ss=new Scanner(System.in);
int d=ss.nextInt();
t.prob(d,"A","B","C");
}
}
