import java.util.*;
class pn
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
int n=ss.nextInt();
int num=0,i=0;
String pn="";
for(i=1;i<=n;i++)
{
int c=0;
for(num=i;num>=1;num--)
{
if(i%num==0)
{
c+=1;
}
}
if(c==2)
{
pn=pn+i+" ";
}
}
System.out.println(pn);
}
}
