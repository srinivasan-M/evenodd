import java.util.*;
class square
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
ArrayList<Integer> al1=new ArrayList<Integer>();
ArrayList<Integer> al2=new ArrayList<Integer>();
ArrayList<Integer> al3=new ArrayList<Integer>();
ArrayList<Integer> al4=new ArrayList<Integer>();
int p,q,r,s;
System.out.println("Enter the pointts for the first coordinate:");
for(int i=0;i<2;i++)
{
al1.add(ss.nextInt());
}
p=al1.get(0)-al1.get(1);
System.out.println("Enter the pointts for the second coordinate:");
for(int i=0;i<2;i++)
{
al2.add(ss.nextInt());
}
q=al1.get(0)-al1.get(1);
System.out.println("Enter the pointts for the third coordinate:");
for(int i=0;i<2;i++)
{
al3.add(ss.nextInt());
}
r=al1.get(0)-al1.get(1);
System.out.println("Enter the pointts for the fourth coordinate:");
for(int i=0;i<2;i++)
{
al4.add(ss.nextInt());
}
s=al1.get(0)-al1.get(1);
if(p+r==0||p+r==p*2 && q+s==0||q+s==q*2)
{
System.out.println("Given coordinates form a square");
}
else
System.out.print("Given coordinates not form a square");
}
}
