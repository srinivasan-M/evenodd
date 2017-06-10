import java.util.*;
class pnum
{
public static void main(String args[])
{
ArrayList<Integer> al=new ArrayList<Integer>();
Scanner ss=new Scanner(System.in);
int n=ss.nextInt();
for(int i=1;i<=n;i++)
{
int a=primevalue(i);
if(a==0)
al.add(i);
}
int b=0,f=1;
int[] c=new int[al.size()];
for(int k:al)
{
c[b++]=k;
f++;
}
for(int j=0;j<f;j++)
{
for(int l=0;l<f;l++)
{
if(j!=l)
{
int sum=c[j]+c[l]-1;
if(al.contains(sum))
{
System.out.print(c[j]+" + "+c[l]+" = "+sum);
}
}
}
}
}
public static int primevalue(int p)
{
int count=0;
for(int x=2;x<=p/2;x++)
{
if(p%x==0)
{
count=1;
break;
}
}
if(count==0)
return 0;
else
return 1;
}
}
