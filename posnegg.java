import java.util.*;
class posnegg
{
public static void main(String args[])
{
//ArrayList<Integer> al=new ArrayList<Integer>();
Scanner ss=new Scanner(System.in);
int n=ss.nextInt();
int sum,c=0,c1=1,min;
int[] a=new int[n];
System.out.print("Enter the list elements");
for(int i=0;i<n;i++)
{
a[i]=ss.nextInt();
}
min=Math.abs(a[0]+a[1]);
for(int i=0;i<n;i++)
{
for(int j=1+1;j<n;j++)
{
	sum=Math.abs(a[i]+a[j]);
	if(sum<min)
	{
		c=i;
		c1=j;
		min=sum;
	}
}

}
System.out.println(a[c]);
System.out.println(a[c1]);
}
}
