import java.util.*;
import java.util.Arrays;
class repeat
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
for(int i=0;i<n-1;i++)
{
if(a[i]==a[i+1])
{
System.out.println(a[i]+" ");
}
}
}
}
