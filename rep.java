import java.util.*;
import java.util.Arrays;
class rep
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
int n=ss.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++)
{
a[i]=ss.nextInt();
}
Arrays.sort(a);
for(int i=0;i<n-1;)
{
if(a[i]!=a[i+1])
{
System.out.println(a[i]+" ");
i+=1;
}
else
i+=2;
}
}
}
